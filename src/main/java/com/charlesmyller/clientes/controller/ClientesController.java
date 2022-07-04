package com.charlesmyller.clientes.controller;

import com.charlesmyller.clientes.entity.Cliente;
import com.charlesmyller.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) throws Exception {
        return clienteService.salvar(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Integer id){
        return clienteService.buscarPorId(id);
    }
}
