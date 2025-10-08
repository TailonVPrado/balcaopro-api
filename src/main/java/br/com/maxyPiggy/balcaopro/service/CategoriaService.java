package br.com.maxyPiggy.balcaopro.service;

import br.com.maxyPiggy.balcaopro.model.Categoria;
import br.com.maxyPiggy.balcaopro.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria findById(Long id) throws Exception{
        Optional<Categoria> retorno = categoriaRepository.findById(id);
        if(retorno.isPresent()){
            return retorno.get();
        }else{
            throw new Exception("Categoria com o ID ("+id+") não encontrada");
        }
    }

    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }

    public Categoria insert(Categoria categoria) throws Exception{
        return categoriaRepository.saveAndFlush(categoria);
    }

    public Categoria update(Categoria categoria) throws Exception{
        return categoriaRepository.saveAndFlush(categoria);
    }

    public Categoria delete(Categoria categoria) throws Exception{
        categoria.setAtivo(false);
        return categoriaRepository.saveAndFlush(categoria);
    }
}