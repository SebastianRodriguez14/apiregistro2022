/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.restcontroller;

import com.apiregistro_evc.entity.Distrito;
import com.apiregistro_evc.service.DistritoService;
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
@RequestMapping("distrito")
public class DistritoController {
    
        @Autowired
    private DistritoService disService;
    
    @GetMapping
    public List<Distrito> findAll(){
        return disService.findAll();
    }
    
    @GetMapping("state/{state}")
    public List<Distrito> findByState(@PathVariable boolean state){
        return disService.findByState(state);
    }
    
    @GetMapping("{id}")
    public Optional<Distrito> findById(@PathVariable long id){
        return disService.findById(id);
    }
    
    @PostMapping
    public Distrito post(@RequestBody Distrito dis){
        return disService.add(dis);
    }
    
    @PutMapping("{id}")
    public Distrito put(@PathVariable long id, @RequestBody Distrito dis){
        dis.setCodigo(id);
        return disService.update(dis);
    }
    
    @DeleteMapping("{id}")
    public Distrito delete(@PathVariable long id){
        return disService.delete(id);
    }
    
}
