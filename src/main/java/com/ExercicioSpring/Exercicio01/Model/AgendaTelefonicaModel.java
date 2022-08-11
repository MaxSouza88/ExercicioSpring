package com.ExercicioSpring.Exercicio01.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="AgendaTelefonica")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgendaTelefonicaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroID;

    @Column(length= 11,nullable = false)
    private Long cpf;

    @Column(length= 15, nullable = false)
    private Long numeroCel;

    @Column(length = 250,nullable = false)
    private String nome;

}
