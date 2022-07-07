/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiregistro_evc.service.impln;

import com.apiregistro_evc.entity.Cliente;
import com.apiregistro_evc.repository.ClienteRepository;
import com.apiregistro_evc.service.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ClienteServiceImpln implements ClienteService{
    
    @Autowired
    private ClienteRepository cliRep;

    @Override
    public List<Cliente> findAll() {
        return cliRep.findAll();
    }

    @Override
    public Optional<Cliente> findById(long codigo) {
       return cliRep.findById(codigo);
    }

    @Override
    public List<Cliente> findByState(boolean estado) {
        return cliRep.findByState(estado);
    }
    
    @Override
    public List<Cliente> findByStartName(String nombre) {
        return cliRep.findByStartName(nombre.toUpperCase());
    }
    
    @Override
    public Optional<Cliente> findByDni(String dni){
        return cliRep.findByDni(dni);
    }

    @Override
    public Cliente add(Cliente cli) {
        cliRep.save(cli);
        return cli;
    }

    @Override
    public Cliente update(Cliente cli) {
        cliRep.save(cli);
        return cli;
    }

    @Override
    public Cliente delete(long codigo) {
        Cliente cli = cliRep.getById(codigo);
        cli.setEstado(false);
        
        return cliRep.save(cli);
    }
    
}


