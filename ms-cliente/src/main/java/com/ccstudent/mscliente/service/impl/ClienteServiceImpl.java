package com.ccstudent.mscliente.service.impl;

import com.ccstudent.mscliente.entity.Cliente;
import com.ccstudent.mscliente.repository.ClienteRepository;
import com.ccstudent.mscliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repo;

    @Override
    public List<Cliente> findAll() {
        return repo.findAll();
    }

    @Override
    public Cliente create(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public Cliente update(Long id, Cliente cliente) {
        Cliente existing = repo.findById(id).orElseThrow();
        existing.setNombre(cliente.getNombre());
        existing.setDni(cliente.getDni());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
