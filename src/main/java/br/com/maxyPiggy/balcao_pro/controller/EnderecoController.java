package br.com.maxyPiggy.balcao_pro.controller;

import br.com.maxyPiggy.balcao_pro.model.Endereco;
import br.com.maxyPiggy.balcao_pro.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/endereco")
@Tag(name = "Endereços", description = "Endpoints para o gerenciamento de endereços")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria um novo endereço", description = "Cadastra um novo endereço no sistema.")
    public Endereco insert (@RequestBody Endereco endereco) throws Exception{
        return enderecoService.insert(endereco);
    }

    @PutMapping(path = "/{id}")
    @Operation(summary = "Atualiza um endereço", description = "Atualiza os dados de um endereço existente no sistema.")
    public Endereco update ( @PathVariable Long id,
                          @RequestBody Endereco endereco) throws Exception{
        return enderecoService.update(id, endereco);
    }

    @GetMapping(path = "/{id}")
    @Operation(summary = "Busca um endereço por ID", description = "Retorna os detalhes de um endereço com base no seu ID.")
    public Endereco findById (@PathVariable Long id) throws Exception{
        return enderecoService.findById(id);
    }

    @GetMapping(path = "/all")
    @Operation(summary = "Lista todos os endereços", description = "Retorna todos os endereços cadastrados no sistema.")
    public List<Endereco> findByAll ()  throws Exception{
        return enderecoService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    @Operation(summary = "Desativa um endereço", description = "Desativa um endereço do sistema.")
    public Endereco delete(@PathVariable Long id) throws Exception{
        return enderecoService.delete(id);
    }
}
