package com.codeclan.bookingsystem.bookingsystem;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import com.codeclan.bookingsystem.bookingsystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.bookingsystem.bookingsystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.bookingsystem.bookingsystem.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingsystemApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void canGetCoursesByRating()
	{
		List<Course> found = courseRepository.findCoursesByStarRating(3);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetCustomerByCourseId(){
		List<Customer> found = customerRepository.findCustomersBookingWithCourseId(1L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetCoursesForCustomer() {
		List<Course> found = courseRepository.findAllCoursesByCustomerId(1L);
		assertEquals(2, found.size());
	}

	@Test
	public void findBookingsByDate() {
		List<Booking> found = bookingRepository.findBookingsByDate("01/01/2019");
		assertEquals(2, found.size());
	}

}
