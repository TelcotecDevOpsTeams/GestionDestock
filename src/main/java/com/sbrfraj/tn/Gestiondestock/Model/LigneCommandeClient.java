package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class LigneCommandeClient extends AbstractEntity{
    @Id
    @GeneratedValue
    @Column
    private String IDLigneCommandeClient;


//    @ManyToOne()
//    @JoinColumn(name = "IDCommandeClient")
//    private CommandeClient commandeClient;
//
//    @ManyToOne()
//    @JoinColumn(name = "IDArticle")
//    private Article article;
}
