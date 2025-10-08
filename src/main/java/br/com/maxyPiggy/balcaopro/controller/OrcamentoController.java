package br.com.maxyPiggy.balcaopro.controller;

import br.com.maxyPiggy.balcaopro.model.Orcamento;
import br.com.maxyPiggy.balcaopro.service.OrcamentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/orcamento")
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Orcamento insert (@RequestBody Orcamento orcamento) throws Exception{
        return orcamentoService.insert(orcamento);
    }

    @PutMapping(path = "/{id}")
    public Orcamento update ( @PathVariable Long id,
                         @RequestBody Orcamento orcamento) throws Exception{
        return orcamentoService.update(id, orcamento);
    }

    @GetMapping(path = "/{id}")
    public Orcamento findById (@PathVariable Long id) throws Exception{
        return orcamentoService.findById(id);
    }

    @GetMapping(path = "/all")
    public List<Orcamento> findByAll ()  throws Exception{
        return orcamentoService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    public Orcamento delete(@PathVariable Long id) throws Exception{
        return orcamentoService.delete(id);
    }
}