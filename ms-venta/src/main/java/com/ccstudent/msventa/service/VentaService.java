package com.ccstudent.msventa.service;

import com.ccstudent.msventa.entity.Venta;

import java.util.List;

public interface VentaService{
    List<Venta> findAll();
    Venta create(Venta venta);
    Venta findById(Long id);
}
