package org.lld.bookmyshow24.controllers;

import org.lld.bookmyshow24.dtos.ResponseStatus;
import org.lld.bookmyshow24.dtos.SignUpRequestDTO;
import org.lld.bookmyshow24.dtos.SignUpResponseDTO;
import org.lld.bookmyshow24.models.User;
import org.lld.bookmyshow24.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDTO signUp(SignUpRequestDTO signUpRequest) {
        SignUpResponseDTO signUpResponse = new SignUpResponseDTO();

        try {
            User user = userService.signUp(
                    signUpRequest.getEmail(),
                    signUpRequest.getPassword()
            );

            signUpResponse.setUserId(user.getId());
            signUpResponse.setResponseStatus(ResponseStatus.SUCCESS);

        } catch(Exception exception) {

            signUpResponse.setResponseStatus(ResponseStatus.FAILURE);
            signUpResponse.setMessage(exception.getMessage());

        }

        return signUpResponse;
    }
}
