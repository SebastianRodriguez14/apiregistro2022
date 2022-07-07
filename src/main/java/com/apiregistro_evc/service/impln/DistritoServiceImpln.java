/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service.impln;

import com.apiregistro_evc.entity.Distrito;
import com.apiregistro_evc.repository.DistritoRepository;
import com.apiregistro_evc.service.DistritoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */


@Service
public class DistritoServiceImpln implements DistritoService{
    
    @Autowired
    private DistritoRepository disRep;
    
        @Override
    public List<Distrito> findAll() {
        return disRep.findAll();
    }

    @Override
    public Optional<Distrito> findById(long codigo) {
       return disRep.findById(codigo);
    }

    @Override
    public List<Distrito> findByState(boolean estado) {
        return disRep.findByState(estado);
    }

    @Override
    public Distrito add(Distrito dis) {
        disRep.save(dis);
        return dis;
    }

    @Override
    public Distrito update(Distrito dis) {
        disRep.save(dis);
        return dis;
    }

    @Override
    public Distrito delete(long codigo) {
        Distrito dis = disRep.getById(codigo);
        dis.setEstado(false);
        
        return disRep.save(dis);
    }
    
    
}
