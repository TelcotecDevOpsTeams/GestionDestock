package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class entreprise extends AbstractEntity {
    @Id
    @GeneratedValue
    @Column
    private String IDEntreprise;



}
