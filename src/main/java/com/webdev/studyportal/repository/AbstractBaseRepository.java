package com.webdev.studyportal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.webdev.studyportal.model.AbstractData;

@NoRepositoryBean
public interface AbstractBaseRepository<T extends AbstractData> extends CrudRepository<T, Long> {

}
