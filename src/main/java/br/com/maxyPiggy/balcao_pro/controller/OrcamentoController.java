package br.com.maxyPiggy.balcao_pro.controller;

import br.com.maxyPiggy.balcao_pro.model.Orcamento;
import br.com.maxyPiggy.balcao_pro.service.OrcamentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/orcamento")
@Tag(name = "Orçamentos", description = "Endpoints para o gerenciamento de orçamentos")
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria um novo orçamento", description = "Cadastra um novo orçamento no sistema.")
    public Orcamento insert (@RequestBody Orcamento orcamento) throws Exception{
        return orcamentoService.insert(orcamento);
    }

    @PutMapping(path = "/{id}")
    @Operation(summary = "Atualiza um orçamento", description = "Atualiza os dados de um orçamento existente.")
    public Orcamento update ( @PathVariable Long id,
                         @RequestBody Orcamento orcamento) throws Exception{
        return orcamentoService.update(id, orcamento);
    }

    @GetMapping(path = "/{id}")
    @Operation(summary = "Busca orçamento por ID", description = "Retorna os detalhes de um orçamento com base no seu ID.")
    public Orcamento findById (@PathVariable Long id) throws Exception{
        return orcamentoService.findById(id);
    }

    @GetMapping(path = "/all")
    @Operation(summary = "Lista todos os orçamentos", description = "Retorna todos os orçamentos cadastrados no sistema.")
    public List<Orcamento> findByAll ()  throws Exception{
        return orcamentoService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    @Operation(summary = "Remove um orçamento", description = "Remove um orçamento do sistema.")
    public Orcamento delete(@PathVariable Long id) throws Exception{
        return orcamentoService.delete(id);
    }
}