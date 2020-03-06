package com.saad.poject2.gescompte.metier;

import java.util.List;

import com.saad.poject2.gescompte.entities.Client;

public interface ClientMetier {
    public Client saveClient(Client c);
    public List<Client> listClient();
}