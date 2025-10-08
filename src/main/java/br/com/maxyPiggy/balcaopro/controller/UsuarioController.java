package br.com.maxyPiggy.balcaopro.controller;

import br.com.maxyPiggy.balcaopro.model.Usuario;
import br.com.maxyPiggy.balcaopro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario insert (@RequestBody Usuario usuario) throws Exception{
        return usuarioService.insert(usuario);
    }

    @PutMapping(path = "/{id}")
    public Usuario update ( @PathVariable Long id,
                         @RequestBody Usuario usuario) throws Exception{
        return usuarioService.update(id, usuario);
    }

    @GetMapping(path = "/{id}")
    public Usuario findById (@PathVariable Long id) throws Exception{
        return usuarioService.findById(id);
    }

    @GetMapping(path = "/all")
    public List<Usuario> findByAll ()  throws Exception{
        return usuarioService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    public Usuario delete(@PathVariable Long id) throws Exception{
        return usuarioService.delete(id);
    }
}