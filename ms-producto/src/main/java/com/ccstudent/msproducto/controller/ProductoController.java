package com.ccstudent.msproducto.controller;

import com.ccstudent.msproducto.dto.UpdateStockDTO;
import com.ccstudent.msproducto.entity.Producto;
import com.ccstudent.msproducto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class    ProductoController {
    @Autowired
    ProductoService service;

    @GetMapping
    public List<Producto> listar() {
        return service.findAll();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto obj) {
        return service.create(obj);
    }

    @PutMapping("/{id}")
    public Producto editar(@PathVariable Long id, @RequestBody Producto obj) {
        return service.update(id, obj);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.delete(id);
    }
    @PutMapping("/stock/{id}")
    public Producto actualizarStock(@PathVariable Long id, @RequestBody UpdateStockDTO dto) {
        return service.updateStock(id, dto.getStock());
    }
}
