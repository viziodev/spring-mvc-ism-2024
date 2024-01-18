package org.example.services.impl;

import org.example.entities.Article;
import org.example.repositories.ArticleRepository;
import org.example.repositories.impl.ArticleRepositoryBDImpl;
import org.example.repositories.impl.ArticleRepositoryListImpl;
import org.example.services.CommandeService;
import java.util.List;

public class CommandeServiceImpl implements CommandeService {
    //Couplage Fort
   // private ArticleRepositoryBDImpl articleRepository = new ArticleRepositoryBDImpl();
     private ArticleRepository articleRepository ;

    public CommandeServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void setArticleRepository(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> listeArticle() {
        return articleRepository.getArticles();
    }
}
