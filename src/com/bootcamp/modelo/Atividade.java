package com.bootcamp.modelo;

public abstract class Atividade {

    private static final double XP_BASE = 15.0;

    private String titulo;
    private String descricao;

    protected Atividade(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double obterXp();

    protected double getXpBase() {
        return XP_BASE;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
