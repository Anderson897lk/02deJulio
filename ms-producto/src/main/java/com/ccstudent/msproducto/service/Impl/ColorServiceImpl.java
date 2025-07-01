package com.ccstudent.msproducto.service.Impl;

import com.ccstudent.msproducto.entity.Color;
import com.ccstudent.msproducto.repository.ColorRepository;
import com.ccstudent.msproducto.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    ColorRepository colorRepository;

    @Override
    public List<Color> findAll() {
        return colorRepository.findAll();
    }
}
