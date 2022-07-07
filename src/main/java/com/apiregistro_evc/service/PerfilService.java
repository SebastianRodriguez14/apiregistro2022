/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service;

import com.apiregistro_evc.entity.Perfil;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Usuario
 */
public interface PerfilService {
    public List<Perfil> findAll();
    
    public Optional<Perfil> findById(long codigo);
    
    public List<Perfil> findByState(boolean estado);
    
    public Perfil add(Perfil per);
    
    public Perfil update(Perfil per);
    
    public Perfil delete(long codigo);
}