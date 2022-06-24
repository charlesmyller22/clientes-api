package com.charlesmyller.clientes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientesController {

    @GetMapping("/{nome}")
    public String welcome(@PathVariable String nome){
        return nome;
    }
}
