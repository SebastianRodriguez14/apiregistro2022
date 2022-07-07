/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.repository;

import com.apiregistro_evc.entity.Distrito;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Usuario
 */
public interface DistritoRepository extends JpaRepository<Distrito, Long>{
    
    @Query("select d from distrito d where d.estado = :estado")
    public List<Distrito> findByState(@Param("estado") boolean estado);
    
    
}
