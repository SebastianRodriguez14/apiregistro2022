
package com.apiregistro_evc.service;

import com.apiregistro_evc.entity.Categoria;
import java.util.List;
import java.util.Optional;

public interface CategoriaService{
    
    public List<Categoria> findAll();
    
    public Optional<Categoria> findById(long codigo);
    
    public List<Categoria> findByState(boolean estado);
    
    public Categoria add(Categoria cat);
    
    public Categoria update(Categoria cat);
    
    public Categoria delete(long codigo);
}
