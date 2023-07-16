package com.webdev.studyportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webdev.studyportal.repository.ArticleRepository;
import com.webdev.studyportal.repository.CourseRepository;

@SpringBootApplication
public class StudyportalApplication implements CommandLineRunner{

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudyportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------------------COURS----------------------");
		courseRepository.findAll().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("----------------------ARTICLES----------------------");
		articleRepository.findAll().forEach(System.out::println);
		
	}

}
