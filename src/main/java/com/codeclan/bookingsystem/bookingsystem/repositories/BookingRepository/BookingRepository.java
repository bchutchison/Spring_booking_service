package com.codeclan.bookingsystem.bookingsystem.repositories.BookingRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

List<Booking> findBookingsByDate(String date);

}
