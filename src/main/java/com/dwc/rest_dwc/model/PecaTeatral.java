package com.dwc.rest_dwc.model;

import jakarta.persistence.*;

@Entity
@Table(name="peca_teatral")
public class PecaTeatral {

    @Id
    private int id;
    private String titulo;
    private String ano_estreia;

    @ManyToOne
    @JoinColumn(name = "diretor_id", referencedColumnName = "id")
    private DiretorTeatral diretor;

    public PecaTeatral(){

    }

    public PecaTeatral(int id, String titulo, String ano_estreia, DiretorTeatral diretor) {
        this.id = id;
        this.titulo = titulo;
        this.ano_estreia = ano_estreia;
        this.diretor = diretor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno_estreia() {
        return ano_estreia;
    }

    public void setAno_estreia(String ano_estreia) {
        this.ano_estreia = ano_estreia;
    }

    public DiretorTeatral getDiretor() {
        return diretor;
    }

    public void setDiretor(DiretorTeatral diretor) {
        this.diretor = diretor;
    }

}
