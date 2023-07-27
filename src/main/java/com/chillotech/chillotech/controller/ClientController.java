package com.chillotech.chillotech.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.chillotech.chillotech.entites.Client;
import com.chillotech.chillotech.service.ClientService;

@RestController
@RequestMapping(path = "client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(/* consumes = APPLICATION_JSON_VALUE */)
    public void creer(@RequestBody Client client) {
        this.clientService.creer(client);

    }

}