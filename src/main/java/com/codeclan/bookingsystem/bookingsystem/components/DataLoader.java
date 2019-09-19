package com.codeclan.bookingsystem.bookingsystem.components;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import com.codeclan.bookingsystem.bookingsystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.bookingsystem.bookingsystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.bookingsystem.bookingsystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {

    }

        public void run(ApplicationArguments args) {
            Customer customer1 = new Customer("Mike", "Edinburgh", 31);
            customerRepository.save(customer1);

            Customer customer2 = new Customer("Jo", "Glasgow", 21);
            customerRepository.save(customer2);

            Course course1 = new Course("Coding", "Glasgow", 4);
            courseRepository.save(course1);

            Course course2 = new Course("Cooking", "Aberdeen", 3);
            courseRepository.save(course2);

            Course course3 = new Course("First Aid", "Edinburgh", 3);
            courseRepository.save(course3);

            Course course4 = new Course("Driving", "Thurles", 2);
            courseRepository.save(course4);

            Booking booking1 = new Booking("01-01-2019", course1, customer1);
            bookingRepository.save(booking1);

            Booking booking2 = new Booking("01-01-2019", course1, customer2);
            bookingRepository.save(booking2);

            Booking booking3 = new Booking("21-05-2019", course2, customer1);
            bookingRepository.save(booking3);

        }
}

