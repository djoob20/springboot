package com.webdev.studyportal.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.webdev.studyportal.model.Course;
import com.webdev.studyportal.property.CustomProperty;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CourseProxy {
	
	@Autowired
	private CustomProperty props;

	public Iterable<Course> getCourses() {
		String baseApiUrl = props.getApiUrl();
		String getCourseUrl = baseApiUrl + "/courses";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Iterable<Course>> response = restTemplate.exchange(
				getCourseUrl, 
				HttpMethod.GET, 
				null,
				new ParameterizedTypeReference<Iterable<Course>>() {
				});

		log.debug("GET Courses call " + response.getStatusCode().toString());

		return response.getBody();
	}
	
	public Course getCourse(long id) {
		String baseApiUrl = props.getApiUrl();
		String getCourseUrl = baseApiUrl + "/course/" + id;
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Course> response = restTemplate.exchange(
				getCourseUrl, 
				HttpMethod.POST, 
				null,
				Course.class);
		
		log.debug("GET Course call " + response.getStatusCode().toString());
		
		return response.getBody();
		

	}

}
