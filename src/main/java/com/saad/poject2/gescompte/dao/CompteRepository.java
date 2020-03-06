package com.saad.poject2.gescompte.dao;

import com.saad.poject2.gescompte.entities.Compte;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,String>{
    
}