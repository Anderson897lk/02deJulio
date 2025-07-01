package com.ccstudent.msventa.service.impl;

import com.ccstudent.msventa.entity.Venta;
import com.ccstudent.msventa.repository.VentaRepository;
import com.ccstudent.msventa.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImp implements VentaService {
    @Autowired
    VentaRepository repository;


    @Override
    public List<Venta> findAll() {
        return repository.findAll();
    }

    @Override
    public Venta create(Venta venta) {
        return repository.save(venta);
    }

    @Override
    public Venta findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
