package org.example.entities;

import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Commande {
    private Long id;
    private LocalDateTime dateCmde;
    private  Double total;
    private EEtatCommande etat;
}
