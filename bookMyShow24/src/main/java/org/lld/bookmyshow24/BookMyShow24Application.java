package org.lld.bookmyshow24;

import org.lld.bookmyshow24.controllers.UserController;
import org.lld.bookmyshow24.dtos.SignUpRequestDTO;
import org.lld.bookmyshow24.dtos.SignUpResponseDTO;
import org.lld.bookmyshow24.models.BaseModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // for auditing what happened when
public class BookMyShow24Application implements CommandLineRunner {

	@Autowired
	UserController userController;

	@Override
	public void run(String... args) throws Exception {
		SignUpRequestDTO req = new SignUpRequestDTO();
		req.setEmail("yash.rai2@gmail.com");
		req.setPassword("123456");

		SignUpResponseDTO responseDTO = userController.signUp(req);
	}

	public static void main(String[] args) {
		SpringApplication.run(BookMyShow24Application.class, args);
	}
}

