package com.desafio.alura.javadesafioapirest.controller;

import com.desafio.alura.javadesafioapirest.dto.SerieDTO;
import com.desafio.alura.javadesafioapirest.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/series")
public class SerieController {
    @Autowired
    private SerieService service;

    @GetMapping("/frases")
    public SerieDTO getFrase(){
       return service.getFrase();
    }
}
