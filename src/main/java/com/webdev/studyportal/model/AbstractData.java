package com.webdev.studyportal.model;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected long id;
	
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "c_number")
	protected int number;
	
	@Column
	protected String title;
	
	@Column
	protected String description;
	
	@Column
	protected String content;
	
	@CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
	protected Date createdAt;
	
	@Column
	protected int views;

	

}
