
package com.apiregistro_evc.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "producto")
@Table(name = "t_producto")
public class Producto implements Serializable {
    
    private static final long serialVersion = 1L;
    
    @Id
    @Column(name = "codpro")
    private long codigo;
    @Column(name = "nompro")
    private String nombre;
    @Column(name = "precpro")
    private double precioCompra;
    @Column(name = "prevpro")
    private double precioVenta;
    @Column(name = "canpro")
    private int cantidad;
    @Column(name = "estpro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "codcat", nullable = false)
    private Categoria categoria;
    
    
    
}
