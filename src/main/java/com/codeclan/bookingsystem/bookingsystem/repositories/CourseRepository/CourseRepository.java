package com.codeclan.bookingsystem.bookingsystem.repositories.CourseRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.repositories.CustomerRepository.CustomerRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCoursesByStarRating(int starRating);

    List<Course> findAllCoursesByCustomerId(Long id);

}
