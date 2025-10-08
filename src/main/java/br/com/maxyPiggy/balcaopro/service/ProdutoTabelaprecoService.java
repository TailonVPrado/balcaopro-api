package br.com.maxyPiggy.balcaopro.service;

import br.com.maxyPiggy.balcaopro.model.ProdutoTabelapreco;
import br.com.maxyPiggy.balcaopro.repository.ProdutoTabelaprecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoTabelaprecoService {

    @Autowired
    ProdutoTabelaprecoRepository produtoTabelaprecoRepository;

    public ProdutoTabelapreco findById(Long id) throws Exception{
        Optional<ProdutoTabelapreco> retorno = produtoTabelaprecoRepository.findById(id);
        if(retorno.isPresent()){
            return retorno.get();
        }else{
            throw new Exception("ProdutoTabelapreco com o ID ("+id+") não encontrado");
        }
    }

    public List<ProdutoTabelapreco> findAll(){
        return produtoTabelaprecoRepository.findAll();
    }

    public ProdutoTabelapreco insert(ProdutoTabelapreco produtoTabelapreco) throws Exception{
        return produtoTabelaprecoRepository.saveAndFlush(produtoTabelapreco);
    }

    public ProdutoTabelapreco update(Long id, ProdutoTabelapreco produtoTabelapreco) throws Exception{
        return produtoTabelaprecoRepository.saveAndFlush(produtoTabelapreco);
    }

    public ProdutoTabelapreco delete(Long id) throws Exception{
        ProdutoTabelapreco produtoTabelapreco = findById(id);
        produtoTabelapreco.setAtivo(false);
        return produtoTabelaprecoRepository.saveAndFlush(produtoTabelapreco);
    }
}