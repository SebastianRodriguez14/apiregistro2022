
package com.apiregistro_evc.service.impln;

import com.apiregistro_evc.entity.Categoria;
import com.apiregistro_evc.repository.CategoriaRepository;
import com.apiregistro_evc.service.CategoriaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaServiceImpln implements CategoriaService{
    
    @Autowired
    private CategoriaRepository catRep;

    @Override
    public List<Categoria> findAll() {
        return catRep.findAll();
    }

    @Override
    public Optional<Categoria> findById(long codigo) {
       return catRep.findById(codigo);
    }

    @Override
    public List<Categoria> findByState(boolean estado) {
        return catRep.findByState(estado);
    }

    @Override
    public Categoria add(Categoria cat) {
        catRep.save(cat);
        return cat;
    }

    @Override
    public Categoria update(Categoria cat) {
        catRep.save(cat);
        return cat;
    }

    @Override
    public Categoria delete(long codigo) {
        Categoria cat = catRep.getById(codigo);
        cat.setEstado(false);
        
        return catRep.save(cat);
    }
    
    
    
}
