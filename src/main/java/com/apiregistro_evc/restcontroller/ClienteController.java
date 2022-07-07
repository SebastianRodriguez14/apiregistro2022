/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.restcontroller;

import com.apiregistro_evc.entity.Cliente;
import com.apiregistro_evc.service.ClienteService;
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
@RequestMapping("cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService cliService;
    
    @GetMapping
    public List<Cliente> findAll(){
        return cliService.findAll();
    }
    
    @GetMapping("state/{state}")
    public List<Cliente> findByState(@PathVariable boolean state){
        return cliService.findByState(state);
    }
    
    @GetMapping("nombre/{name}") 
    public List<Cliente> findByStartName(@PathVariable String name){
        return cliService.findByStartName(name);
    }
    
    @GetMapping("{id}")
    public Optional<Cliente> findById(@PathVariable long id){
        return cliService.findById(id);
    }
    
    @GetMapping("dni/{dni}")
    public Optional<Cliente> findByDni(@PathVariable String dni){
        return cliService.findByDni(dni);
    }
    
    @PostMapping
    public Cliente post(@RequestBody Cliente cli){
        return cliService.add(cli);
    }
    
    @PutMapping("{id}")
    public Cliente put(@PathVariable long id, @RequestBody Cliente cli){
        cli.setCodigo(id);
        return cliService.update(cli);
    }
    
    @DeleteMapping("{id}")
    public Cliente delete(@PathVariable long id){
        return cliService.delete(id);
    }
    
}