package com.saad.poject2.gescompte.services;

import com.saad.poject2.gescompte.entities.Compte;
import com.saad.poject2.gescompte.metier.CompteMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CompteRestService {
    @Autowired
    CompteMetier compteMetier;
    @RequestMapping(value = "/comptes", method = RequestMethod.POST)
    public Compte saveCompte(@RequestBody Compte cp) {
        return compteMetier.saveCompte(cp);
    }
    @RequestMapping(value="/comptes/{code}", method=RequestMethod.GET)
    public Compte getCompte(@PathVariable String code) {
        return compteMetier.getCompte(code);
    }
    
}