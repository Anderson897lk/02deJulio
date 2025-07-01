package com.ccstudent.msproducto.controller;

import com.ccstudent.msproducto.entity.Color;
import com.ccstudent.msproducto.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/color")
@CrossOrigin("*")
public class ColorController {
    @Autowired
    ColorService colorService;

    @GetMapping
    public List<Color> listar() {
        return colorService.findAll();
    }
}
