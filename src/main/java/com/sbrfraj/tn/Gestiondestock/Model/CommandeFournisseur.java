package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class CommandeFournisseur extends AbstractEntity{

    @Column(name = "codeComFor")
    private String codeComFor;

    @ManyToOne()
    @JoinColumn(name = "IDFournisseur",nullable = false)
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private Set<LigneCommandeFournisseur> ligneCommandeFournisseurs;

}
