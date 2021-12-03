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
public class CommandeClient  extends AbstractEntity{




    @ManyToOne()
    @JoinColumn(name = "IDClient",nullable = false)
    private Client client;

    @OneToMany(mappedBy = "CommandeClient")
    private Set<LigneCommandeClient> ligneCommandeClients;
}
