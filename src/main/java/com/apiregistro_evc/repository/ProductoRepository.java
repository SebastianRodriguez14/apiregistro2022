/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.repository;

import com.apiregistro_evc.entity.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Usuario
 */
public interface ProductoRepository  extends JpaRepository<Producto, Long>{
    
    @Query("select p from producto p where p.estado = :estado")
    public List<Producto> findByState(@Param("estado") boolean estado);
    
    @Query("select p from producto p where upper(p.nombre) like :nombre%")
    public List<Producto> findByStartName(@Param("nombre") String nombre);
    
}
