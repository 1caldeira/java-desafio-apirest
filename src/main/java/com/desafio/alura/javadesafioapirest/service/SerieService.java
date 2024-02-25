package com.desafio.alura.javadesafioapirest.service;

import com.desafio.alura.javadesafioapirest.dto.SerieDTO;
import com.desafio.alura.javadesafioapirest.model.Frase;
import com.desafio.alura.javadesafioapirest.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SerieService {
    @Autowired
    private FrasesRepository repository;

    public SerieDTO getFrase() {
        Frase frase = repository.findFraseRandom();
        return new SerieDTO(frase.getId(),frase.getFrase(), frase.getPersonagem(), frase.getTitulo(), frase.getPoster());
    }
}
