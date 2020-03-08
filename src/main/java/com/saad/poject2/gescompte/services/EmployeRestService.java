package com.saad.poject2.gescompte.services;

import java.util.List;

import com.saad.poject2.gescompte.entities.Employe;
import com.saad.poject2.gescompte.metier.EmployeMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeRestService {
    @Autowired
    private EmployeMetier empMeetier;
    @RequestMapping(value = "/employes", method = RequestMethod.POST)
    public Employe saveEmploye(@RequestBody Employe e) {
        return empMeetier.saveEmploye(e);
    }
    @RequestMapping(value = "/employes", method = RequestMethod.GET)
    public List<Employe> listEmploye() {
        return empMeetier.listEmploye();
    }
}