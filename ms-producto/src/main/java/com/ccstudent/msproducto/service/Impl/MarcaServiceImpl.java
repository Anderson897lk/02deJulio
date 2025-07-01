package com.ccstudent.msproducto.service.Impl;

import com.ccstudent.msproducto.entity.Marca;
import com.ccstudent.msproducto.repository.MarcaRepository;
import com.ccstudent.msproducto.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {
    @Autowired
    MarcaRepository marcaRepository;


    @Override
    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

    @Override
    public Marca create(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public Marca update(Long id, Marca marca) {
        Marca objmarca =marcaRepository.findById(id).orElseThrow();
        objmarca.setMarca(marca.getMarca());
        return marcaRepository.save(objmarca);

    }

    @Override
    public void delete(Long id) {
        marcaRepository.deleteById(id);
    }
}
