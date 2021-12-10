package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class LigneVente extends AbstractEntity{

    @ManyToOne()
    @JoinColumn(name = "IDVente",nullable = false)
    private Vente vente;

    @ManyToOne()
    @JoinColumn(name = "IDArticle",nullable = false)
    private Article article;

}
