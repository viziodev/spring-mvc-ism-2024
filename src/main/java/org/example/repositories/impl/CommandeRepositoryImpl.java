package org.example.repositories.impl;

import org.example.entities.Commande;
import org.example.repositories.CommandeRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CommandeRepositoryImpl implements CommandeRepository {
    @Override
    public List<Commande> getCommandes() {
        return null;
    }
}
