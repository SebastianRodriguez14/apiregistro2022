/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.restcontroller;

import com.apiregistro_evc.entity.Perfil;
import com.apiregistro_evc.service.PerfilService;
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
@RequestMapping("perfil")
public class PerfilController {
    
    @Autowired
    private PerfilService perService;
    
    @GetMapping
    public List<Perfil> findAll(){
        return perService.findAll();
    }
    
    @GetMapping("state/{state}")
    public List<Perfil> findByState(@PathVariable boolean state){
        return perService.findByState(state);
    }
    
    @GetMapping("{id}")
    public Optional<Perfil> findById(@PathVariable long id){
        return perService.findById(id);
    }
    
    @PostMapping
    public Perfil post(@RequestBody Perfil per){
        return perService.add(per);
    }
    
    @PutMapping("{id}")
    public Perfil put(@PathVariable long id, @RequestBody Perfil per){
        per.setCodigo(id);
        return perService.update(per);
    }
    
    @DeleteMapping("{id}")
    public Perfil delete(@PathVariable long id){
        return perService.delete(id);
    }
    
}

