package br.com.maxyPiggy.balcaopro.controller;

import br.com.maxyPiggy.balcaopro.model.ProdutoOrcamento;
import br.com.maxyPiggy.balcaopro.service.ProdutoOrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtoorcamento")
public class ProdutoOrcamentoController {

    @Autowired
    private ProdutoOrcamentoService produtoOrcamentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoOrcamento insert (@RequestBody ProdutoOrcamento produtoOrcamento) throws Exception{
        return produtoOrcamentoService.insert(produtoOrcamento);
    }

    @PutMapping(path = "/{id}")
    public ProdutoOrcamento update ( @PathVariable Long id,
                         @RequestBody ProdutoOrcamento produtoOrcamento) throws Exception{
        return produtoOrcamentoService.update(id, produtoOrcamento);
    }

    @GetMapping(path = "/{id}")
    public ProdutoOrcamento findById (@PathVariable Long id) throws Exception{
        return produtoOrcamentoService.findById(id);
    }

    @GetMapping(path = "/all")
    public List<ProdutoOrcamento> findByAll ()  throws Exception{
        return produtoOrcamentoService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    public ProdutoOrcamento delete(@PathVariable Long id) throws Exception{
        return produtoOrcamentoService.delete(id);
    }
}