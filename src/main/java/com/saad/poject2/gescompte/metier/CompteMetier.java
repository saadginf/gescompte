package com.saad.poject2.gescompte.metier;

import com.saad.poject2.gescompte.entities.Compte;

public interface CompteMetier {
    public Compte saveCompte(Compte cp);
    public Compte getCompte(String code);

}