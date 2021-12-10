package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity{

    @Column(name = "codeLigneCommandeFournisseur")
    private String codeLigComFou;


    @ManyToOne()
    @JoinColumn(name = "IDCommandeFournisseur",nullable = false)
    private CommandeFournisseur commandeFournisseur ;

    @ManyToOne()
    @JoinColumn(name = "IDArticle",nullable = false)
    private Article article;

}
