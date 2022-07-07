
package com.apiregistro_evc.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "categoria")
@Table(name = "t_categoria")
public class Categoria implements Serializable{
    private static final long serialVersion = 1L;
     
    @Id
    @Column(name = "codcat")
    private long codigo;
    
    @Column(name = "nomcat")
    private String nombre;
    
    @Column(name = "estcat")
    private boolean estado;
    
}
