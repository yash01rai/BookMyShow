package org.lld.bookmyshow24.repositories;

import org.lld.bookmyshow24.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    @Override
    Booking save(Booking booking);
}
