package com.saad.poject2.gescompte.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor
public class Employe implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeEmploye;
    private String nomEmploye;
    @ManyToOne
    @JoinColumn(name="CODE_EMP_SUP")
    private Employe employeSup;
    @ManyToMany
    @JoinTable(name="EM_GRP")
    private Collection<Groupe> groupes;

    public Employe(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }


    
}