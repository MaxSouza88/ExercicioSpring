package com.ExercicioSpring.Exercicio01.Repository;

import com.ExercicioSpring.Exercicio01.Model.AgendaTelefonicaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository< AgendaTelefonicaModel,Long>{

}
