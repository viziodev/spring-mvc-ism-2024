package org.example.repositories;

import org.example.entities.Article;

import java.util.List;

public interface ArticleRepository {
     Article saveArticle(Article article);
     List<Article> getArticles();

}
