package com.ExercicioSpring.Exercicio01.Controller;


import com.ExercicioSpring.Exercicio01.Model.AgendaTelefonicaModel;

import com.ExercicioSpring.Exercicio01.Service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AgendaController {

    @Autowired
    private AgendaService service;

    @GetMapping(path = "/agendaTelefonica")
    public List<AgendaTelefonicaModel> buscarNomes(){
       return service.buscarTodaAgenda();
    }

    @GetMapping(path = "/agendaTelefonica/{codigo}")
    public Optional<AgendaTelefonicaModel> buscarCodigoId (@PathVariable Long codigo){
        return service.buscarCodigoId(codigo);
    }

    @PostMapping(path = "/agendaTelefonica")
    public AgendaTelefonicaModel cadastraNovo(@RequestBody AgendaTelefonicaModel agenda){
        return service.cadastrar(agenda);
    }

    @PutMapping(path = "/agendaTelefonica/{codigo}")
    public AgendaTelefonicaModel alteraCadastro(@RequestBody AgendaTelefonicaModel alterar){
        return service.alterar(alterar);
    }

    @DeleteMapping(path = "/agendaTelefonica/{codigo}")
    public void deletarCadastro(@PathVariable Long codigo){
        service.deletaCadastro(codigo);
    }


}
