package com.webdev.studyportal.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "courses")
public class CoursesEndpoint {
	
	@ReadOperation
	public String selectReleaseNotes(@Selector String selector) {
		return null;
	}

}
