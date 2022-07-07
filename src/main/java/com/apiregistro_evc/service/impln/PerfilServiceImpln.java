/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service.impln;

import com.apiregistro_evc.entity.Perfil;
import com.apiregistro_evc.repository.PerfilRepository;
import com.apiregistro_evc.service.PerfilService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

@Service
public class PerfilServiceImpln implements PerfilService{
    
    @Autowired
    private PerfilRepository perRep;
    
        @Override
    public List<Perfil> findAll() {
        return perRep.findAll();
    }

    @Override
    public Optional<Perfil> findById(long codigo) {
       return perRep.findById(codigo);
    }

    @Override
    public List<Perfil> findByState(boolean estado) {
        return perRep.findByState(estado);
    }

    @Override
    public Perfil add(Perfil per) {
        perRep.save(per);
        return per;
    }

    @Override
    public Perfil update(Perfil per) {
        perRep.save(per);
        return per;
    }

    @Override
    public Perfil delete(long codigo) {
        Perfil per = perRep.getById(codigo);
        per.setEstado(false);
        
        return perRep.save(per);
    }
    
    
}