package br.com.maxyPiggy.balcaopro.service;

import br.com.maxyPiggy.balcaopro.model.Tabelapreco;
import br.com.maxyPiggy.balcaopro.repository.TabelaprecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TabelaprecoService {

    @Autowired
    TabelaprecoRepository tabelaprecoRepository;

    public Tabelapreco findById(Long id) throws Exception{
        Optional<Tabelapreco> retorno = tabelaprecoRepository.findById(id);
        if(retorno.isPresent()){
            return retorno.get();
        }else{
            throw new Exception("Tabelapreco com o ID ("+id+") não encontrado");
        }
    }

    public List<Tabelapreco> findAll(){
        return tabelaprecoRepository.findAll();
    }

    public Tabelapreco insert(Tabelapreco tabelapreco) throws Exception{
        return tabelaprecoRepository.saveAndFlush(tabelapreco);
    }

    public Tabelapreco update(Long id, Tabelapreco tabelapreco) throws Exception{
        return tabelaprecoRepository.saveAndFlush(tabelapreco);
    }

    public Tabelapreco delete(Long id) throws Exception{
        Tabelapreco tabelapreco = findById(id);
        tabelapreco.setAtivo(false);
        return tabelaprecoRepository.saveAndFlush(tabelapreco);
    }
}