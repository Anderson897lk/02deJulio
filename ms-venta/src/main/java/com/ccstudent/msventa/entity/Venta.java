package com.ccstudent.msventa.entity;

import com.ccstudent.msventa.dto.ClienteDto;
import com.ccstudent.msventa.dto.FormaPagoDto;
import com.ccstudent.msventa.dto.TipoVentaDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="venta")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_CLIENTE_VENTA"))
    private ClienteDto clienteDto;

    @ManyToOne
    @JoinColumn(name = "idTipoVenta", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_TIPOVENTA_VENTA"))
    private TipoVentaDto tipoVentaDto;
    @ManyToOne
    @JoinColumn(name = "idFormaPago", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_FORMAPAGO_VENTA"))
    private FormaPagoDto formaPagoDto;

    @Column(name = "fechaventa")
    private LocalDateTime fechaventa;

    @PrePersist
    public void prePersist() {
        this.fechaventa = LocalDateTime.now();
    }

    private BigDecimal subtotal;
    private BigDecimal igv;
    private BigDecimal total;
}
