package com.webdev.studyportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webdev.studyportal.repository.CourseRepository;

@SpringBootApplication
public class StudyportalApplication implements CommandLineRunner{

	@Autowired
	private CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudyportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		courseRepository.findAll().forEach(System.out::println);
		
	}

}
