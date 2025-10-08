package br.com.maxyPiggy.balcaopro.service;

import br.com.maxyPiggy.balcaopro.model.ProdutoOrcamento;
import br.com.maxyPiggy.balcaopro.repository.ProdutoOrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoOrcamentoService {

    @Autowired
    ProdutoOrcamentoRepository produtoOrcamentoRepository;

    public ProdutoOrcamento findById(Long id) throws Exception{
        Optional<ProdutoOrcamento> retorno = produtoOrcamentoRepository.findById(id);
        if(retorno.isPresent()){
            return retorno.get();
        }else{
            throw new Exception("ProdutoOrcamento com o ID ("+id+") não encontrado");
        }
    }

    public List<ProdutoOrcamento> findAll(){
        return produtoOrcamentoRepository.findAll();
    }

    public ProdutoOrcamento insert(ProdutoOrcamento produtoOrcamento) throws Exception{
        return produtoOrcamentoRepository.saveAndFlush(produtoOrcamento);
    }

    public ProdutoOrcamento update(ProdutoOrcamento produtoOrcamento) throws Exception{
        return produtoOrcamentoRepository.saveAndFlush(produtoOrcamento);
    }

    public ProdutoOrcamento delete(ProdutoOrcamento produtoOrcamento) throws Exception{
        produtoOrcamento.setAtivo(false);
        return produtoOrcamentoRepository.saveAndFlush(produtoOrcamento);
    }
}