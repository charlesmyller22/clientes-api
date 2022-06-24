package com.charlesmyller.clientes.service;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    public String welcome(String nome) {
        return nome;
    }
}
