package com.codeclan.bookingsystem.bookingsystem.repositories.BookingRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;

import com.codeclan.bookingsystem.bookingsystem.projections.EmbedCourseAndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(excerptProjection = EmbedCourseAndCustomer.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {

List<Booking> findBookingsByDate(String date);

}
