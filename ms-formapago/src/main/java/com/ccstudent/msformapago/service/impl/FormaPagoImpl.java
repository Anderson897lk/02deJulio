package com.ccstudent.msformapago.service.impl;

import com.ccstudent.msformapago.entity.FormaPago;
import com.ccstudent.msformapago.repository.FormaPagoRepository;
import com.ccstudent.msformapago.service.FormaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagoImpl implements FormaPagoService {
    @Autowired
    FormaPagoRepository repository;

    @Override
    public List<FormaPago> findAll() {
        return repository.findAll();
    }
}
