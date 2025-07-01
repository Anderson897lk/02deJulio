package com.ccstudent.msproducto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name="producto")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producto;

    @ManyToOne
    @JoinColumn(name = "marca_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_MARCA_PRODUCTO"))
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "genero_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_GENERO_PRODUCTO"))
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "color_id", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_COLOR_PRODUCTO"))
    private Color color;
    private Integer stock;
    private Double precioventa;
    private Double costocompra;


}
