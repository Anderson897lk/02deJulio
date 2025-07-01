package com.ccstudent.msproducto.controller;

import com.ccstudent.msproducto.entity.Marca;
import com.ccstudent.msproducto.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
@CrossOrigin("*")
public class MarcaController {
    @Autowired
    MarcaService marcaService;

    @GetMapping
    public List<Marca> listar() {
        return marcaService.findAll();
    }

    @PostMapping
    public Marca guardar(@RequestBody Marca marca) {
        return marcaService.create(marca);
    }

    @PutMapping("/{id}")
    public Marca editar(@PathVariable Long id, @RequestBody Marca marca) {
        return marcaService.update(id, marca);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        marcaService.delete(id);
    }


}


