package com.codeclan.bookingsystem.bookingsystem.projections;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import org.springframework.data.rest.core.config.Projection;

public interface EmbedCourseAndCustomer {

    @Projection(name="embedCourseAndCustomer", types = Booking.class)
    public interface EmberCourseAndCustomer{
       public String getDate();
       public Course getCourse();
       public Customer getCustomer();

    }
}
