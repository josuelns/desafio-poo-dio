package com.bootcamp.modelo;

public class Curso extends Atividade {

    private final int horas;

    public Curso(String titulo, String descricao, int horas) {
        super(titulo, descricao);
        this.horas = horas;
    }

    @Override
    public double obterXp() {
        return getXpBase() * horas;
    }

    public int getHoras() {
        return horas;
    }
}
