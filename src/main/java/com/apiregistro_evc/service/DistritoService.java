/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service;

import com.apiregistro_evc.entity.Distrito;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Usuario
 */
public interface DistritoService {
    public List<Distrito> findAll();
    
    public Optional<Distrito> findById(long codigo);
    
    public List<Distrito> findByState(boolean estado);
    
    public Distrito add(Distrito cat);
    
    public Distrito update(Distrito cat);
    
    public Distrito delete(long codigo);
}
