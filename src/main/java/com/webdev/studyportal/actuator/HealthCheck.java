package com.webdev.studyportal.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import com.webdev.studyportal.service.CourseService;


public class HealthCheck implements HealthIndicator{

	

	@Override
	public Health health() {
	
		
		return Health.up().build();
	}


}
