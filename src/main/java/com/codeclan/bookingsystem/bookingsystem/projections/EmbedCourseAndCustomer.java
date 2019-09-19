package com.codeclan.bookingsystem.bookingsystem.projections;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import org.springframework.data.rest.core.config.Projection;

    @Projection(name="embedCourseAndCustomer", types = Booking.class)
    public interface EmbedCourseAndCustomer{
       public String getDate();
       public Course getCourse();
       public Customer getCustomer();
    }
