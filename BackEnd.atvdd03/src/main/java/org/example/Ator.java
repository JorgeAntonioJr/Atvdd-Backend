package org.example;

public class Ator implements Indicavel {
    private String nome;
    private boolean elegivel;
    private String categoria;

    public Ator(String nome, boolean elegivel) {
        this.nome = nome;
        this.elegivel = elegivel;
        this.categoria = "Ator";
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
