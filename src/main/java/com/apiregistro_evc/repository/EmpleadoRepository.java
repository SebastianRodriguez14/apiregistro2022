/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.repository;

import com.apiregistro_evc.entity.Empleado;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Usuario
 */
public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    
    @Query("select e from empleado e where e.estado = :estado")
    public List<Empleado> findByState(@Param("estado") boolean estado);
    
    @Query("select e from empleado e where upper(e.nombre) like :nombre%")
    public List<Empleado> findByStartName(@Param("nombre") String nombre);
    
    @Query("select e from empleado e where e.dni like :dni")
    public Optional<Empleado> findByDni(@Param("dni") String dni);
            
    
}

