package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "utilistaeur")
public class Utilisateur extends AbstractEntity {


    @Column(name=" nom")
    private String nom;

    @ManyToOne()
    @JoinColumn(name = "IDEntreprise",nullable = false)
    private Entreprise entreprise;

}
