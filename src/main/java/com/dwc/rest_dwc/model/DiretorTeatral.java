package com.dwc.rest_dwc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="diretor_teatral")
public class DiretorTeatral {

    @Id
    private int id;
    private String nome;

    public DiretorTeatral() {

    }

    public DiretorTeatral(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }
}
