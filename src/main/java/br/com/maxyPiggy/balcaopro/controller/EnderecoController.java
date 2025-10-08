package br.com.maxyPiggy.balcaopro.controller;

import br.com.maxyPiggy.balcaopro.model.Endereco;
import br.com.maxyPiggy.balcaopro.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco insert (@RequestBody Endereco endereco) throws Exception{
        return enderecoService.insert(endereco);
    }

    @PutMapping(path = "/{id}")
    public Endereco update ( @PathVariable Long id,
                          @RequestBody Endereco endereco) throws Exception{
        return enderecoService.update(id, endereco);
    }

    @GetMapping(path = "/{id}")
    public Endereco findById (@PathVariable Long id) throws Exception{
        return enderecoService.findById(id);
    }

    @GetMapping(path = "/all")
    public List<Endereco> findByAll ()  throws Exception{
        return enderecoService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    public Endereco delete(@PathVariable Long id) throws Exception{
        return enderecoService.delete(id);
    }
}
