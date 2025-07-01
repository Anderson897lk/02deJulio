package com.ccstudent.msproducto.service;

import com.ccstudent.msproducto.entity.Marca;

import java.util.List;

public interface MarcaService {
    List<Marca> findAll();

    Marca create(Marca marca);

    Marca update(Long id, Marca marca);

    void delete(Long id);
}
