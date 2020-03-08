package com.saad.poject2.gescompte.metier;

import java.util.List;

import com.saad.poject2.gescompte.entities.Employe;

public interface EmployeMetier {
    public Employe saveEmploye(Employe e);
    public List<Employe> listEmploye();
}