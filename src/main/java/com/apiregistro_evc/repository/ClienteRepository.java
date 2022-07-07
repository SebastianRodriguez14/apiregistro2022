/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.repository;

import com.apiregistro_evc.entity.Cliente;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Usuario
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    @Query("select c from cliente c where c.estado = :estado")
    public List<Cliente> findByState(@Param("estado") boolean estado);
    
    @Query("select c from cliente c where upper(c.nombre) like :nombre%")
    public List<Cliente> findByStartName(@Param("nombre") String nombre);
    
    @Query("select c from cliente c where c.dni like :dni")
    public Optional<Cliente> findByDni(@Param("dni") String dni);
            
    
}
