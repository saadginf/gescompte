package com.saad.poject2.gescompte.dao;

import com.saad.poject2.gescompte.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepositiry extends JpaRepository<Client,Long>{
    
}