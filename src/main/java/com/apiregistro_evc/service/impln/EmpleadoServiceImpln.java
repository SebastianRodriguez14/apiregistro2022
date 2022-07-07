/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service.impln;

import com.apiregistro_evc.entity.Empleado;
import com.apiregistro_evc.repository.EmpleadoRepository;
import com.apiregistro_evc.service.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class EmpleadoServiceImpln implements EmpleadoService{
    
    @Autowired
    private EmpleadoRepository empRep;

    @Override
    public List<Empleado> findAll() {
        return empRep.findAll();
    }

    @Override
    public Optional<Empleado> findById(long codigo) {
       return empRep.findById(codigo);
    }

    @Override
    public List<Empleado> findByState(boolean estado) {
        return empRep.findByState(estado);
    }
    
    @Override
    public List<Empleado> findByStartName(String nombre) {
        return empRep.findByStartName(nombre.toUpperCase());
    }
    
    @Override
    public Optional<Empleado> findByDni(String dni){
        return empRep.findByDni(dni);
    }
    
    @Override
    public Empleado add(Empleado emp) {
        empRep.save(emp);
        return emp;
    }

    @Override
    public Empleado update(Empleado emp) {
        empRep.save(emp);
        return emp;
    }

    @Override
    public Empleado delete(long codigo) {
        Empleado emp = empRep.getById(codigo);
        emp.setEstado(false);
        
        return empRep.save(emp);
    }
    
}