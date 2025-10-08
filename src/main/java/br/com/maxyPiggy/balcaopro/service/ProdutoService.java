package br.com.maxyPiggy.balcaopro.service;

import br.com.maxyPiggy.balcaopro.model.Produto;
import br.com.maxyPiggy.balcaopro.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto findById(Long id) throws Exception{
        Optional<Produto> retorno = produtoRepository.findById(id);
        if(retorno.isPresent()){
            return retorno.get();
        }else{
            throw new Exception("Produto com o ID ("+id+") não encontrado");
        }
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto insert(Produto produto) throws Exception{
        return produtoRepository.saveAndFlush(produto);
    }

    public Produto update(Produto produto) throws Exception{
        return produtoRepository.saveAndFlush(produto);
    }

    public Produto delete(Produto produto) throws Exception{
        produto.setAtivo(false);
        return produtoRepository.saveAndFlush(produto);
    }
}