package com.ExercicioSpring.Exercicio01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

        @GetMapping(path = "/status")
        public String checar(){

            return "Funcionando OK !!!! ";
        }
    }

