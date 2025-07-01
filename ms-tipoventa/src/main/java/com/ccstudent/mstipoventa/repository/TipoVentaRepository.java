package com.ccstudent.mstipoventa.repository;

import com.ccstudent.mstipoventa.entity.TipoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoVentaRepository extends JpaRepository<TipoVenta, Long> {
}
