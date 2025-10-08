package br.com.maxyPiggy.balcao_pro.controller;

import br.com.maxyPiggy.balcao_pro.model.Usuario;
import br.com.maxyPiggy.balcao_pro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping(path = "/usuario")
@Tag(name = "Usuários", description = "Endpoints para o gerenciamento de usuários") // 1. Agrupa todos os endpoints desta classe
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria um novo usuário", description = "Cadastra um novo usuário no sistema.")
    public Usuario insert (@RequestBody Usuario usuario) throws Exception{
        return usuarioService.insert(usuario);
    }

    @PutMapping(path = "/{id}")
    @Operation(summary = "Atualiza um novo usuário", description = "Atualiza um novo usuário no sistema.")
    public Usuario update ( @PathVariable Long id,
                         @RequestBody Usuario usuario) throws Exception{
        return usuarioService.update(id, usuario);
    }

    @GetMapping(path = "/{id}")
    @Operation(summary = "Busca um usuário por ID", description = "Retorna os detalhes de um usuário específico com base no seu ID.")
    public Usuario findById (@PathVariable Long id) throws Exception{
        return usuarioService.findById(id);
    }

    @GetMapping(path = "/all")
    @Operation(summary = "Busca todos os usuarios cadastrados no sistema", description = "Busca todos os usuarios cadastrados no sistema.")
    public List<Usuario> findByAll ()  throws Exception{
        return usuarioService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    @Operation(summary = "Desativa um usuário", description = "Desativa um usuário do sistema.")
    public Usuario delete(@PathVariable Long id) throws Exception{
        return usuarioService.delete(id);
    }
}