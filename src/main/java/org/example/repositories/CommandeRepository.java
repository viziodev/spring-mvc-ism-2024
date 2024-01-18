package org.example.repositories;

import org.example.entities.Commande;

import java.util.List;

public interface CommandeRepository {
    List<Commande> getCommandes();
}
