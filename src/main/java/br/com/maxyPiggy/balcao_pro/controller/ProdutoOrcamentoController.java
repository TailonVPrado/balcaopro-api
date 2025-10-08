package br.com.maxyPiggy.balcao_pro.controller;

import br.com.maxyPiggy.balcao_pro.model.ProdutoOrcamento;
import br.com.maxyPiggy.balcao_pro.service.ProdutoOrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/produtoorcamento")
@Tag(name = "Produtos de Orçamento", description = "Endpoints para o gerenciamento de produtos associados a orçamentos")
public class ProdutoOrcamentoController {

    @Autowired
    private ProdutoOrcamentoService produtoOrcamentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria um novo produto de orçamento", description = "Cadastra um novo produto vinculado a um orçamento.")
    public ProdutoOrcamento insert (@RequestBody ProdutoOrcamento produtoOrcamento) throws Exception{
        return produtoOrcamentoService.insert(produtoOrcamento);
    }

    @PutMapping(path = "/{id}")
    @Operation(summary = "Atualiza um produto de orçamento", description = "Atualiza os dados de um produto vinculado ao orçamento.")
    public ProdutoOrcamento update ( @PathVariable Long id,
                         @RequestBody ProdutoOrcamento produtoOrcamento) throws Exception{
        return produtoOrcamentoService.update(id, produtoOrcamento);
    }

    @GetMapping(path = "/{id}")
    @Operation(summary = "Busca produto de orçamento por ID", description = "Retorna os detalhes de um produto de orçamento com base no seu ID.")
    public ProdutoOrcamento findById (@PathVariable Long id) throws Exception{
        return produtoOrcamentoService.findById(id);
    }

    @GetMapping(path = "/all")
    @Operation(summary = "Lista todos os produtos de orçamento", description = "Retorna todos os produtos de orçamento cadastrados no sistema.")
    public List<ProdutoOrcamento> findByAll ()  throws Exception{
        return produtoOrcamentoService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    @Operation(summary = "Remove um produto de orçamento", description = "Remove um produto de orçamento do sistema.")
    public ProdutoOrcamento delete(@PathVariable Long id) throws Exception{
        return produtoOrcamentoService.delete(id);
    }
}