package com.webdev.studyportal.model;

import jakarta.persistence.Entity;

@Entity(name="courses")
public class Course extends AbstractData{
	

	@Override
	public String toString() {
		return "Course [id=" + id + ", number=" + number + ", title=" + title + ", description=" + description
				+ ", content=" + content + ", createdDate=" + createdAt + ", views=" + views + "]";
	}

	
	
	
	
}
