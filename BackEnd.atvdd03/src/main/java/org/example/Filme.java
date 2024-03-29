package org.example;

public class Filme implements Indicavel {
    private String nome;
    private boolean elegivel;
    private String categoria;

    public Filme(String nome, boolean elegivel) {
        this.nome = nome;
        this.elegivel = elegivel;
        this.categoria = "Filme";
    }

    @Override
    public boolean isElegivel() {
        return elegivel;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }
}
