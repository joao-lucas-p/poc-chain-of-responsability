package com.joaopinho.pocchainofresponsability.controller;

import com.joaopinho.pocchainofresponsability.model.User;
import com.joaopinho.pocchainofresponsability.services.ValidateNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ValidateNameController {

    @Autowired
    private ValidateNameService service;

    @GetMapping("/validate-name")
    public ResponseEntity<Boolean> validateName(@RequestBody User user){
        if (user != null){
            return ResponseEntity.ok(service.check(user));
        } else return ResponseEntity.badRequest().build();
    }

}
