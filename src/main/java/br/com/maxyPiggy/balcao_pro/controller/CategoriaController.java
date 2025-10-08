package br.com.maxyPiggy.balcao_pro.controller;

import br.com.maxyPiggy.balcao_pro.model.Categoria;
import br.com.maxyPiggy.balcao_pro.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/categoria")
@Tag(name = "Categorias", description = "Endpoints para o gerenciamento de categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria uma nova categoria", description = "Cadastra uma nova categoria no sistema.")
    public Categoria insert(@RequestBody Categoria categoria) throws Exception {
        return categoriaService.insert(categoria);
    }

    @PutMapping(path = "/{id}")
    @Operation(summary = "Atualiza uma categoria", description = "Atualiza os dados de uma categoria existente.")
    public Categoria update(@PathVariable Long id,
                            @RequestBody Categoria categoria) throws Exception {
        return categoriaService.update(id, categoria);
    }

    @GetMapping(path = "/{id}")
    @Operation(summary = "Busca categoria por ID", description = "Retorna os detalhes de uma categoria com base no seu ID.")
    public Categoria findById(@PathVariable Long id) throws Exception {
        return categoriaService.findById(id);
    }

    @GetMapping(path = "/all")
    @Operation(summary = "Lista todas as categorias", description = "Retorna todas as categorias cadastradas no sistema.")
    public List<Categoria> findByAll() throws Exception {
        return categoriaService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    @Operation(summary = "Remove uma categoria", description = "Remove uma categoria do sistema.")
    public Categoria delete(@PathVariable Long id) throws Exception {
        return categoriaService.delete(id);
    }
}