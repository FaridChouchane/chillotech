package com.chillotech.chillotech.premiere_couche_controller_continedra_toutes_les_api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class TestController {

    @GetMapping(path = "string")
    public String getString() {
        return "chaîne de caractères transmise par SA";
    }

    @GetMapping()
    public List<String> getList() {
        return List.of("chaîne de caractères", "transmise par SA", "02/10/1985");
    }
}