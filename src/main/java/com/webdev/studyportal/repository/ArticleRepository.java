package com.webdev.studyportal.repository;

import com.webdev.studyportal.model.Article;

import jakarta.transaction.Transactional;

@Transactional
public interface ArticleRepository extends AbstractBaseRepository<Article>{

}
