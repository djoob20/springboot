package com.webdev.studyportal.model;

import jakarta.persistence.Entity;

@Entity(name="articles")
public class Article extends AbstractData{

	@Override
	public String toString() {
		return "Article [id=" + id + ", number=" + number + ", title=" + title + ", description=" + description
				+ ", content=" + content + ", createdAt=" + createdAt + ", views=" + views + "]";
	}
	
	

}
