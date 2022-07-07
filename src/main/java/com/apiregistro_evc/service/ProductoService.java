/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service;

import com.apiregistro_evc.entity.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Usuario
 */
public interface ProductoService {
    public List<Producto> findAll();
    
    public Optional<Producto> findById(long codigo);
    
    public List<Producto> findByState(boolean estado);
    
    public List<Producto> findByStartName(String nombre);
    
    public Producto add(Producto pro);
    
    public Producto update(Producto pro);
    
    public Producto delete(long codigo);
}