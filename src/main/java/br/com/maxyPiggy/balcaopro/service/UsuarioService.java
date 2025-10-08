package br.com.maxyPiggy.balcaopro.service;

import br.com.maxyPiggy.balcaopro.model.Usuario;
import br.com.maxyPiggy.balcaopro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario findById(Long id) throws Exception{
        Optional<Usuario> retorno = usuarioRepository.findById(id);
        if(retorno.isPresent()){
            return retorno.get();
        }else{
            throw new Exception("Usuario com o ID ("+id+") não encontrado");
        }
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario insert(Usuario usuario) throws Exception{
        return usuarioRepository.saveAndFlush(usuario);
    }

    public Usuario update(Usuario usuario) throws Exception{
        return usuarioRepository.saveAndFlush(usuario);
    }

    public Usuario delete(Usuario usuario) throws Exception{
        usuario.setAtivo(false);
        return usuarioRepository.saveAndFlush(usuario);
    }
}