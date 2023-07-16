package com.webdev.studyportal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdev.studyportal.model.Article;
import com.webdev.studyportal.repository.ArticleRepository;

import lombok.Data;

@Data
@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	public Optional <Article>getArticleById(final long articleId) {
		return this.articleRepository.findById(articleId);
	}
	
	public Iterable <Article>getAllArticles() {
		return this.articleRepository.findAll();
	}
	
	public void deleteArticle(final long articleId) {
		this.articleRepository.deleteById(articleId);
	}
	
	public Article saveArticle(Article article) {
		Article savedArticle = this.articleRepository.save(article);
		return savedArticle;
	}

}
