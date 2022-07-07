/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.restcontroller;

import com.apiregistro_evc.entity.Empleado;
import com.apiregistro_evc.service.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */

@RestController
@RequestMapping("empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empService;
    
    @GetMapping
    public List<Empleado> findAll(){
        return empService.findAll();
    }
    
    @GetMapping("state/{state}")
    public List<Empleado> findByState(@PathVariable boolean state){
        return empService.findByState(state);
    }
    
    @GetMapping("nombre/{name}") 
    public List<Empleado> findByStartName(@PathVariable String name){
        return empService.findByStartName(name);
    }
    
    @GetMapping("dni/{dni}")
    public Optional<Empleado> findByDni(@PathVariable String dni){
        return empService.findByDni(dni);
    }
    
    @GetMapping("{id}")
    public Optional<Empleado> findById(@PathVariable long id){
        return empService.findById(id);
    }
    
    @PostMapping
    public Empleado post(@RequestBody Empleado emp){
        return empService.add(emp);
    }
    
    @PutMapping("{id}")
    public Empleado put(@PathVariable long id, @RequestBody Empleado emp){
        emp.setCodigo(id);
        return empService.update(emp);
    }
    
    @DeleteMapping("{id}")
    public Empleado delete(@PathVariable long id){
        return empService.delete(id);
    }
    
}
