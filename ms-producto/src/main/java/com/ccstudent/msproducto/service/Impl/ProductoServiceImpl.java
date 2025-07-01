package com.ccstudent.msproducto.service.Impl;

import com.ccstudent.msproducto.entity.Marca;
import com.ccstudent.msproducto.entity.Producto;
import com.ccstudent.msproducto.repository.ProductoRepository;
import com.ccstudent.msproducto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(Long id, Producto producto) {
        Producto objproduct= productoRepository.findById(id).orElseThrow();
        objproduct.setProducto(producto.getProducto());
        objproduct.setMarca(producto.getMarca());
        objproduct.setGenero(producto.getGenero());
        objproduct.setColor(producto.getColor());
        objproduct.setStock(producto.getStock());
        objproduct.setPrecioventa(producto.getPrecioventa());
        objproduct.setCostocompra(producto.getCostocompra());
        return productoRepository.save(objproduct);
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto updateStock(Long id, Integer stock) {
        Producto producto= productoRepository.findById(id).orElseThrow();
        producto.setStock(stock);
        return productoRepository.save(producto);
    }
}
