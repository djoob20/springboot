package com.webdev.studyportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.webdev.studyportal.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
