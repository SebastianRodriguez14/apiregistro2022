/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.restcontroller;

import com.apiregistro_evc.entity.Producto;
import com.apiregistro_evc.service.ProductoService;
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
@RequestMapping("producto")
public class ProductoController {
    
    @Autowired
    private ProductoService proService;
    
    @GetMapping
    public List<Producto> findAll(){
        return proService.findAll();
    }
    
    @GetMapping("state/{state}")
    public List<Producto> findByState(@PathVariable boolean state){
        return proService.findByState(state);
    }
    
    @GetMapping("nombre/{name}") 
    public List<Producto> findByStartName(@PathVariable String name){
        return proService.findByStartName(name);
    }
    
    @GetMapping("{id}")
    public Optional<Producto> findById(@PathVariable long id){
        return proService.findById(id);
    }
    
    @PostMapping
    public Producto post(@RequestBody Producto pro){
        return proService.add(pro);
    }
    
    @PutMapping("{id}")
    public Producto put(@PathVariable long id, @RequestBody Producto pro){
        pro.setCodigo(id);
        return proService.update(pro);
    }
    
    @DeleteMapping("{id}")
    public Producto delete(@PathVariable long id){
        return proService.delete(id);
    }
    
}

