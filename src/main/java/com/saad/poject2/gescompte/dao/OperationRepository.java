package com.saad.poject2.gescompte.dao;

import com.saad.poject2.gescompte.entities.Operation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation,Long>{
    
}