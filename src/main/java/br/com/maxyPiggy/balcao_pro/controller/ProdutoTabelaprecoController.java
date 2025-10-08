package br.com.maxyPiggy.balcao_pro.controller;

import br.com.maxyPiggy.balcao_pro.model.ProdutoTabelapreco;
import br.com.maxyPiggy.balcao_pro.service.ProdutoTabelaprecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/produtotabelapreco")
@Tag(name = "Produtos da Tabela de Preço", description = "Endpoints para o gerenciamento de preços por produto e tabela de preço")
public class ProdutoTabelaprecoController {

    @Autowired
    private ProdutoTabelaprecoService produtoTabelaprecoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria um novo preço de produto", description = "Cadastra um novo registro de preço de produto em uma tabela de preço.")
    public ProdutoTabelapreco insert(@RequestBody ProdutoTabelapreco produtoTabelapreco) throws Exception {
        return produtoTabelaprecoService.insert(produtoTabelapreco);
    }

    @PutMapping(path = "/{id}")
    @Operation(summary = "Atualiza um preço de produto", description = "Atualiza os dados de um registro de preço de produto.")
    public ProdutoTabelapreco update(@PathVariable Long id,
                                     @RequestBody ProdutoTabelapreco produtoTabelapreco) throws Exception {
        return produtoTabelaprecoService.update(id, produtoTabelapreco);
    }

    @GetMapping(path = "/{id}")
    @Operation(summary = "Busca preço de produto por ID", description = "Retorna os detalhes de um registro de preço de produto com base no seu ID.")
    public ProdutoTabelapreco findById(@PathVariable Long id) throws Exception {
        return produtoTabelaprecoService.findById(id);
    }

    @GetMapping(path = "/all")
    @Operation(summary = "Lista todos os preços de produto", description = "Retorna todos os registros de preço de produto cadastrados no sistema.")
    public List<ProdutoTabelapreco> findByAll() throws Exception {
        return produtoTabelaprecoService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    @Operation(summary = "Remove um preço de produto", description = "Remove um registro de preço de produto do sistema.")
    public ProdutoTabelapreco delete(@PathVariable Long id) throws Exception {
        return produtoTabelaprecoService.delete(id);
    }
}