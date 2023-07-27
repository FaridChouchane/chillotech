package com.chillotech.chillotech.service;

import org.springframework.stereotype.Service;

import com.chillotech.chillotech.entites.Client;
import com.chillotech.chillotech.repository.ClientRepository;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void creer(Client client) {
        this.clientRepository.save(client);
    }

}
