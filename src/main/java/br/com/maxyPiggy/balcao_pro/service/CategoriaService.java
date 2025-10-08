package br.com.maxyPiggy.balcao_pro.service;

import br.com.maxyPiggy.balcao_pro.model.Categoria;
import br.com.maxyPiggy.balcao_pro.repository.CategoriaRepository;
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

    public Categoria update(Long id, Categoria categoria) throws Exception{
        return categoriaRepository.saveAndFlush(categoria);
    }

    public Categoria delete(Long id) throws Exception{
        Categoria categoria = findById(id);
        categoria.setAtivo(false);
        return categoriaRepository.saveAndFlush(categoria);
    }
}