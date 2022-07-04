package com.charlesmyller.clientes.repository;

import com.charlesmyller.clientes.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    Boolean existsByNome(String nome);
}
