package com.saad.poject2.gescompte.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "GROUPES")
@Data @NoArgsConstructor
public class Groupe implements Serializable{

    private Long codeGroupe;
    private String nomGroupe;
    @ManyToMany(mappedBy = "groupes")
    private Collection<Employe> employes;

    public Groupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

}