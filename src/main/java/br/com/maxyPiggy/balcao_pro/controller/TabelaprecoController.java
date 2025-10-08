package br.com.maxyPiggy.balcao_pro.controller;

import br.com.maxyPiggy.balcao_pro.model.Tabelapreco;
import br.com.maxyPiggy.balcao_pro.service.TabelaprecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/tabelapreco")
@Tag(name = "Tabelas de Preço", description = "Endpoints para o gerenciamento de tabelas de preço")
public class TabelaprecoController {

    @Autowired
    private TabelaprecoService tabelaprecoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria uma nova tabela de preço", description = "Cadastra uma nova tabela de preço no sistema.")
    public Tabelapreco insert(@RequestBody Tabelapreco tabelapreco) throws Exception {
        return tabelaprecoService.insert(tabelapreco);
    }

    @PutMapping(path = "/{id}")
    @Operation(summary = "Atualiza uma tabela de preço", description = "Atualiza os dados de uma tabela de preço existente.")
    public Tabelapreco update(@PathVariable Long id,
                              @RequestBody Tabelapreco tabelapreco) throws Exception {
        return tabelaprecoService.update(id, tabelapreco);
    }

    @GetMapping(path = "/{id}")
    @Operation(summary = "Busca tabela de preço por ID", description = "Retorna os detalhes de uma tabela de preço com base no seu ID.")
    public Tabelapreco findById(@PathVariable Long id) throws Exception {
        return tabelaprecoService.findById(id);
    }

    @GetMapping(path = "/all")
    @Operation(summary = "Lista todas as tabelas de preço", description = "Retorna todas as tabelas de preço cadastradas no sistema.")
    public List<Tabelapreco> findByAll() throws Exception {
        return tabelaprecoService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    @Operation(summary = "Remove uma tabela de preço", description = "Remove uma tabela de preço do sistema.")
    public Tabelapreco delete(@PathVariable Long id) throws Exception {
        return tabelaprecoService.delete(id);
    }
}