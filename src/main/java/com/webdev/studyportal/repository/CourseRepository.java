package com.webdev.studyportal.repository;

import com.webdev.studyportal.model.Course;

import jakarta.transaction.Transactional;

@Transactional
public interface CourseRepository extends AbstractBaseRepository<Course> {

}
