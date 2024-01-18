package org.example;

import org.example.repositories.ArticleRepository;
import org.example.repositories.CommandeRepository;
import org.example.repositories.impl.ArticleRepositoryBDImpl;
import org.example.repositories.impl.ArticleRepositoryListImpl;
import org.example.services.CommandeService;
import org.example.services.impl.CommandeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {

         ApplicationContext context=new AnnotationConfigApplicationContext("org.example.repositories","org.example.services");
         CommandeService commandeService=( CommandeService ) context.getBean("service");

          commandeService.listeArticle();
    }


}
