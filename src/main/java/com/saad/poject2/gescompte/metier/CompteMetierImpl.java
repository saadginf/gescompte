package com.saad.poject2.gescompte.metier;

import java.util.Date;

import com.saad.poject2.gescompte.dao.CompteRepository;
import com.saad.poject2.gescompte.entities.Compte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CompteMetierImpl implements CompteMetier {
    @Autowired
    CompteRepository cpRepo;

    @Override
    public Compte saveCompte(Compte cp) {
        // TODO Auto-generated method stub
        cp.setDateCreation(new Date());
        return cpRepo.save(cp);
    }

    @Override
    public Compte getCompte(String code) {
        // TODO Auto-generated method stub
        return cpRepo.findById(code).get();
    }
    
}