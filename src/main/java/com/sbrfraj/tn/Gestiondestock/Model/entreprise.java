package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Table@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Entreprise extends AbstractEntity {

    @Column
    private String codeEntreprise;

    @OneToMany(mappedBy = "entreprise")
    private Set<Utilisateur> utilisateurs;

    @OneToMany(mappedBy = "entreprise")
    private Set<Article> articles;
}
