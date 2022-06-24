package com.charlesmyller.clientes.controller;

import com.charlesmyller.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientesController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/{nome}")
    public String welcome(@PathVariable String nome){

        return clienteService.welcome(nome);
    }
}
