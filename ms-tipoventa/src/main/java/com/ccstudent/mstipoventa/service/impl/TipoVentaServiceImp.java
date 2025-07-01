package com.ccstudent.mstipoventa.service.impl;

import com.ccstudent.mstipoventa.entity.TipoVenta;
import com.ccstudent.mstipoventa.repository.TipoVentaRepository;
import com.ccstudent.mstipoventa.service.TipoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoVentaServiceImp implements TipoVentaService {
    @Autowired
    TipoVentaRepository repository;

    @Override
    public List<TipoVenta> findAll() {
        return repository.findAll();
    }
}
