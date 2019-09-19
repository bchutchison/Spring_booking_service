package com.codeclan.bookingsystem.bookingsystem.repositories.CourseRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findAllCoursesByCustomerId(Long id);

}
