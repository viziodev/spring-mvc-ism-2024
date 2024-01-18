package org.example.repositories.impl;

import org.example.entities.Article;
import org.example.repositories.ArticleRepository;

import java.util.List;

public  class ArticleRepositoryBDImpl implements ArticleRepository {
    @Override
    public Article saveArticle(Article article) {
        return null;
    }

    @Override
    public List<Article> getArticles() {
        System.out.println("Liste des articles provenant de la base de donnees");
        return null;
    }
}
