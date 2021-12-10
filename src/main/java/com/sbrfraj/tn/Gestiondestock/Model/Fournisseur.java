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
public class Fournisseur extends AbstractEntity {
    @Column(name = "codeFornisseur")
    private String codeFornisseur;

    @OneToMany(mappedBy = "fournisseur")
    private Set<CommandeFournisseur> commandeFournisseurs;

}
