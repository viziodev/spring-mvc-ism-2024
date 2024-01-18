package org.example.services.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.entities.Article;
import org.example.repositories.ArticleRepository;
import org.example.repositories.CommandeRepository;
import org.example.repositories.impl.ArticleRepositoryBDImpl;
import org.example.repositories.impl.ArticleRepositoryListImpl;
import org.example.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("service")
@RequiredArgsConstructor
public class CommandeServiceImpl implements CommandeService {
      @Autowired
      @Qualifier("repoArticleList")
      private  ArticleRepository articleRepository ;
      private final CommandeRepository commandeRepository;
      @Override
     public List<Article> listeArticle() {
        return articleRepository.getArticles();
     }
}
