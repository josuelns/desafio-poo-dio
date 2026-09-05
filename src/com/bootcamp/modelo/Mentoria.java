package com.bootcamp.modelo;

import java.time.LocalDate;

public class Mentoria extends Atividade {

    private final LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public double obterXp() {
        return getXpBase() + 25.0;
    }

    public LocalDate getData() {
        return data;
    }
}
