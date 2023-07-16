package com.webdev.studyportal.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webdev.studyportal.model.Article;
import com.webdev.studyportal.service.ArticleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/articles")
	public Iterable<Article> getAllCourses(){
		return this.articleService.getAllArticles();
	}
	@GetMapping("/article/{articleId}")
	public Optional <Article>getCourseById(final @PathVariable long articleId) {
		return this.articleService.getArticleById(articleId);
	}

}
