package com.charlesmyller.clientes.service;

import com.charlesmyller.clientes.entity.Cliente;
import com.charlesmyller.clientes.exception.NoSuchElementFoundException;
import com.charlesmyller.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;
    public Cliente salvar(Cliente cliente) throws Exception {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarPorId(Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(()-> new NoSuchElementFoundException("Recurso não encontrado: " + id));
    }
}
