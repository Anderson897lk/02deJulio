package com.ccstudent.mscliente.service;

import com.ccstudent.mscliente.entity.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> findAll();
    Cliente create(Cliente cliente);
    Cliente update(Long id, Cliente cliente);
    void delete(Long id);
}
