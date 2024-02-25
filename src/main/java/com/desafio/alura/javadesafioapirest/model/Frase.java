package com.desafio.alura.javadesafioapirest.model;

import jakarta.persistence.*;

@Entity
@Table(name="frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String frase;
    private String personagem;
    private String titulo;
    private String poster;

    public Frase() {
    }

    public Frase(Long id, String frase, String personagem, String titulo, String poster) {
        this.id = id;
        this.frase = frase;
        this.personagem = personagem;
        this.titulo = titulo;
        this.poster = poster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
