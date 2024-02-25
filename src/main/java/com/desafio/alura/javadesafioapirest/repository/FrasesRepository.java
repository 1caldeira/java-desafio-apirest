package com.desafio.alura.javadesafioapirest.repository;

import com.desafio.alura.javadesafioapirest.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FrasesRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase findFraseRandom();
}
