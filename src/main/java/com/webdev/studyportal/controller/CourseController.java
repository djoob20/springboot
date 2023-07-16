package com.webdev.studyportal.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webdev.studyportal.model.Course;
import com.webdev.studyportal.service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public Iterable<Course> getAllCourses(){
		return this.courseService.getAllCourses();
	}
	@GetMapping("/course/{courseId}")
	public Optional <Course>getCourseById(final @PathVariable long courseId) {
		return this.courseService.getCourseById(courseId);
	}
	
}
