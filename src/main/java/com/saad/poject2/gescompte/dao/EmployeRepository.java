package com.saad.poject2.gescompte.dao;

import com.saad.poject2.gescompte.entities.Employe;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,String>{
    
}