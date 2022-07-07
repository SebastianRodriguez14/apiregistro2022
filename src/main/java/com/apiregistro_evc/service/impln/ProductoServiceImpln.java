/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service.impln;

import com.apiregistro_evc.entity.Producto;
import com.apiregistro_evc.repository.ProductoRepository;
import com.apiregistro_evc.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ProductoServiceImpln implements ProductoService{
    
    @Autowired
    private ProductoRepository proRep;

    @Override
    public List<Producto> findAll() {
        return proRep.findAll();
    }

    @Override
    public Optional<Producto> findById(long codigo) {
       return proRep.findById(codigo);
    }

    @Override
    public List<Producto> findByState(boolean estado) {
        return proRep.findByState(estado);
    }
    
    @Override
    public List<Producto> findByStartName(String nombre) {
        return proRep.findByStartName(nombre.toUpperCase());
    }

    @Override
    public Producto add(Producto pro) {
        proRep.save(pro);
        return pro;
    }

    @Override
    public Producto update(Producto pro) {
        proRep.save(pro);
        return pro;
    }

    @Override
    public Producto delete(long codigo) {
        Producto pro = proRep.getById(codigo);
        pro.setEstado(false);
        
        return proRep.save(pro);
    }
    
}

