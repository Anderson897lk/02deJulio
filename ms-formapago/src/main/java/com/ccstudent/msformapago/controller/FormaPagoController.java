package com.ccstudent.msformapago.controller;

import com.ccstudent.msformapago.entity.FormaPago;
import com.ccstudent.msformapago.service.FormaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/formapago")
@CrossOrigin("*")
public class FormaPagoController {
    @Autowired
    FormaPagoService service;

    @GetMapping
    public List<FormaPago> listar() {
        return service.findAll();
    }

}
