package org.lld.bookmyshow24.repositories;

import org.lld.bookmyshow24.models.Show;
import org.lld.bookmyshow24.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {

    @Override
    Optional<Show> findById(Integer integer);
}
