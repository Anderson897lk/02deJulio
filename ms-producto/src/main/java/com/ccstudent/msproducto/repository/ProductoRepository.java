package com.ccstudent.msproducto.repository;

import com.ccstudent.msproducto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
