package com.saad.poject2.gescompte.metier;

import java.util.List;

import com.saad.poject2.gescompte.dao.ClientRepositiry;
import com.saad.poject2.gescompte.entities.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClientMetierImpl implements ClientMetier {
@Autowired
private ClientRepositiry cRepo;



    @Override
    public Client saveClient(Client c) {
        
        return cRepo.save(c);
    }

    @Override
    public List<Client> listClient() {
       
        return cRepo.findAll();
    }
    
}