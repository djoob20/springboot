package com.webdev.studyportal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdev.studyportal.model.Course;
import com.webdev.studyportal.repository.CourseRepository;

import lombok.Data;

@Data
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Optional <Course>getCourseById(final long courseId) {
		return this.courseRepository.findById(courseId);
	}
	
	public Iterable <Course>getAllCourses() {
		return this.courseRepository.findAll();
	}
	
	public void deleteCourse(final long courseId) {
		this.courseRepository.deleteById(courseId);
	}
	
	public Course saveCourse(Course course) {
		Course savedCourse = this.courseRepository.save(course);
		return savedCourse;
	}
}
