package com.ccstudent.msproducto.controller;

import com.ccstudent.msproducto.entity.Genero;
import com.ccstudent.msproducto.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genero")
@CrossOrigin("*")
public class GeneroController {
    @Autowired
    GeneroService generoService;

    @GetMapping
    public List<Genero> listar() {
        return generoService.findAll();
    }
}
