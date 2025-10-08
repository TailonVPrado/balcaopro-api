package br.com.maxyPiggy.balcaopro.service;

import br.com.maxyPiggy.balcaopro.model.Orcamento;
import br.com.maxyPiggy.balcaopro.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {

    @Autowired
    OrcamentoRepository orcamentoRepository;

    public Orcamento findById(Long id) throws Exception{
        Optional<Orcamento> retorno = orcamentoRepository.findById(id);
        if(retorno.isPresent()){
            return retorno.get();
        }else{
            throw new Exception("Orcamento com o ID ("+id+") não encontrado");
        }
    }

    public List<Orcamento> findAll(){
        return orcamentoRepository.findAll();
    }

    public Orcamento insert(Orcamento orcamento) throws Exception{
        return orcamentoRepository.saveAndFlush(orcamento);
    }

    public Orcamento update(Orcamento orcamento) throws Exception{
        return orcamentoRepository.saveAndFlush(orcamento);
    }

    public Orcamento delete(Orcamento orcamento) throws Exception{
        orcamento.setAtivo(false);
        return orcamentoRepository.saveAndFlush(orcamento);
    }
}