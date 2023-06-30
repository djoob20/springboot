package com.webdev.studyportal.model;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_number")
	private int number;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String content;
	
	@CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
	private Date createdAt;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getC_number() {
		return number;
	}

	public void setC_number(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedDate() {
		return createdAt;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdAt = createdDate;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@Column
	private int views;

	@Override
	public String toString() {
		return "Course [id=" + id + ", number=" + number + ", title=" + title + ", description=" + description
				+ ", content=" + content + ", createdDate=" + createdAt + ", views=" + views + "]";
	}
	
	
	
	
}
