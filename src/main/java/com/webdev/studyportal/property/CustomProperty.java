package com.webdev.studyportal.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix="com.webdev.studyportal")
@Data
public class CustomProperty {

	
	private String apiUrl;
}
