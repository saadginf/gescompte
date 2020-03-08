package com.saad.poject2.gescompte.metier;

import java.util.List;

import com.saad.poject2.gescompte.dao.EmployeRepository;
import com.saad.poject2.gescompte.entities.Employe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeMetierImpl implements EmployeMetier {

    @Autowired
    private EmployeRepository employeRepo;

    @Override
    public Employe saveEmploye(Employe e) {
        return employeRepo.save(e);
    }

    @Override
    public List<Employe> listEmploye() {
        return employeRepo.findAll();
    }
    
}