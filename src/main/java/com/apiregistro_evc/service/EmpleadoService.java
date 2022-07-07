/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service;

import com.apiregistro_evc.entity.Empleado;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Usuario
 */
public interface EmpleadoService {
    public List<Empleado> findAll();
    
    public Optional<Empleado> findById(long codigo);
    
    public List<Empleado> findByState(boolean estado);
    
    public List<Empleado> findByStartName(String nombre);
    
    public Optional<Empleado> findByDni(String dni);
    
    public Empleado add(Empleado emp);
    
    public Empleado update(Empleado emp);
    
    public Empleado delete(long codigo);
}
