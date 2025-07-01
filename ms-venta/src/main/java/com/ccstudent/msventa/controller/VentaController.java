package com.ccstudent.msventa.controller;

import com.ccstudent.msventa.entity.Venta;
import com.ccstudent.msventa.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
@CrossOrigin("*")
public class VentaController {
    @Autowired
    VentaService service;

    @GetMapping
    public List<Venta> listar() {
        return service.findAll();
    }

    @PostMapping
    public Venta guardar(@RequestBody Venta obj) {
        return service.create(obj);
    }
}
