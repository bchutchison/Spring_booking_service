package com.codeclan.bookingsystem.bookingsystem.repositories.CustomerRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersBookingWithCourseId(Long courseId);

    List<Customer> findAllCustomersFromTownByByCourseId(String town, Long courseId);

    List<Customer> findAllCustomersOverCertainAgeForGivenTownForGivenCourse(int age, String town, Long courseId);

}
