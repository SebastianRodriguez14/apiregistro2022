/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.restcontroller;

import com.apiregistro_evc.entity.Categoria;
import com.apiregistro_evc.service.CategoriaService;
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
@RequestMapping("categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService catService;
    
    @GetMapping
    public List<Categoria> findAll(){
        return catService.findAll();
    }
    
    @GetMapping("state/{state}")
    public List<Categoria> findByState(@PathVariable boolean state){
        return catService.findByState(state);
    }
    
    @GetMapping("{id}")
    public Optional<Categoria> findById(@PathVariable long id){
        return catService.findById(id);
    }
    
    @PostMapping
    public Categoria post(@RequestBody Categoria cat){
        return catService.add(cat);
    }
    
    @PutMapping("{id}")
    public Categoria put(@PathVariable long id, @RequestBody Categoria cat){
        cat.setCodigo(id);
        return catService.update(cat);
    }
    
    @DeleteMapping("{id}")
    public Categoria delete(@PathVariable long id){
        return catService.delete(id);
    }
    
}
