package br.com.maxyPiggy.balcaopro.service;

import br.com.maxyPiggy.balcaopro.model.Endereco;
import br.com.maxyPiggy.balcaopro.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public Endereco findById(Long id) throws Exception{
        Optional<Endereco> retorno = enderecoRepository.findById(id);
        if(retorno.isPresent()){
            return retorno.get();
        }else{
            throw new Exception("Endereço com o ID ("+id+") não encontrado");
        }
    }

    public List<Endereco> findAll(){
        return enderecoRepository.findAll();
    }

    public Endereco insert(Endereco endereco) throws Exception{
        return enderecoRepository.saveAndFlush(endereco);
    }

    public Endereco update(Endereco endereco) throws Exception{
        return enderecoRepository.saveAndFlush(endereco);
    }

    public Endereco delete(Endereco endereco) throws Exception{
        endereco.setAtivo(false);
        return enderecoRepository.saveAndFlush(endereco);
    }
}
