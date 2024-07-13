package org.lld.bookmyshow24.repositories;

import org.lld.bookmyshow24.models.Show;
import org.lld.bookmyshow24.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Integer> {

    @Override
    List<ShowSeatType> findAllById(Iterable<Integer> integers);

    List<ShowSeatType> findAllByShow(Show show);
    // select * from showSeatTypes where show_id = ?;
}
