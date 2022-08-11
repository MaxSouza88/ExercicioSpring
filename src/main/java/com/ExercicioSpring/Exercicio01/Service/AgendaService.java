package com.ExercicioSpring.Exercicio01.Service;

import com.ExercicioSpring.Exercicio01.Model.AgendaTelefonicaModel;
import com.ExercicioSpring.Exercicio01.Repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository repository;

   public List<AgendaTelefonicaModel> buscarTodaAgenda(){
       return repository.findAll();
   }

    public Optional<AgendaTelefonicaModel> buscarCodigoId(Long codigo){
        return repository.findById(codigo);
    }

    public AgendaTelefonicaModel cadastrar(AgendaTelefonicaModel novoCadastro){
        novoCadastro.getCpf();
        novoCadastro.getNumeroCel();
        novoCadastro.getNome();

        return repository.save(novoCadastro);
    }

    public AgendaTelefonicaModel alterar (AgendaTelefonicaModel novoCadastro) {
        novoCadastro.getCpf();
        novoCadastro.getNumeroCel();
        novoCadastro.getNome();

        return repository.save(novoCadastro);
    }

    public void deletaCadastro(Long codigo){
       repository.deleteById(codigo);
    }
}
