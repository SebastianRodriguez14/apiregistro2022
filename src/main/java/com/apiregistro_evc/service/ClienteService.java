/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service;

import com.apiregistro_evc.entity.Cliente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Usuario
 */
public interface ClienteService {
    public List<Cliente> findAll();
    
    public Optional<Cliente> findById(long codigo);
    
    public List<Cliente> findByState(boolean estado);
    
    public List<Cliente> findByStartName(String nombre);
    
    public Optional<Cliente> findByDni(String dni);
    
    public Cliente add(Cliente cli);
    
    public Cliente update(Cliente cli);
    
    public Cliente delete(long codigo);
}
