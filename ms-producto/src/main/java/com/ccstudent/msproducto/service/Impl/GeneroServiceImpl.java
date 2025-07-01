package com.ccstudent.msproducto.service.Impl;

import com.ccstudent.msproducto.entity.Genero;
import com.ccstudent.msproducto.repository.GeneroRepository;
import com.ccstudent.msproducto.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {
    @Autowired
    GeneroRepository generoRepository;
    @Override
    public List<Genero> findAll() {
        return generoRepository.findAll();
    }
}
