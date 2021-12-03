package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="article")
public class Article extends AbstractEntity{


    @Column
    private String codeArticle;
    @Column
    private String designation;
    @Column
    private BigDecimal prixUnitaireHt;
    @Column
    private BigDecimal tauxTva;
    @Column
    private BigDecimal prixUnitaireTtc;
    @Column
    private String photo;

   @ManyToOne

            @JoinColumn(name ="IDCategorie",nullable = false)

    private Categorie categorie;

//    @OneToMany(mappedBy = "Article")
//    private Set<LigneCommandeClient> ligneCommandeClients;
}
