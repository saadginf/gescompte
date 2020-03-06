package com.saad.poject2.gescompte.entities;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
    private double taux;

    public CompteEpargne(String codeCompte, Date dateCreation, double solde, double taux) {
        super(codeCompte, dateCreation, solde);
        this.taux = taux;
    }

public CompteEpargne(){
    
}
    

    /**
     * @return double return the taux
     */
    public double getTaux() {
        return taux;
    }

    /**
     * @param taux the taux to set
     */
    public void setTaux(double taux) {
        this.taux = taux;
    }

}