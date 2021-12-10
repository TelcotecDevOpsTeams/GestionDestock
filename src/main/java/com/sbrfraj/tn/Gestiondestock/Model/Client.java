package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
@Entity
public class Client extends AbstractEntity{

    @Column
    private String nom;
    @Column
    private String prenom;
    @Embedded
    private Adresse adresse;
    @Column
    private String photo;
    @Column
    private String email;
    @Column
    private String Tel;

    @OneToMany(mappedBy = "client")
    private Set<CommandeClient> commandeClients;
}
