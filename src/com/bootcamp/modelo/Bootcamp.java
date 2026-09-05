package com.bootcamp.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bootcamp {

    private final String nome;
    private final String descricao;
    private final LocalDate inicio;
    private final LocalDate termino;
    private final List<Atividade> trilha = new ArrayList<>();
    private final List<Desenvolvedor> participantes = new ArrayList<>();

    public Bootcamp(String nome, String descricao, int duracaoDias) {
        this.nome = nome;
        this.descricao = descricao;
        this.inicio = LocalDate.now();
        this.termino = inicio.plusDays(duracaoDias);
    }

    public void incluirAtividade(Atividade atividade) {
        trilha.add(atividade);
    }

    public void registrarParticipante(Desenvolvedor dev) {
        if (!participantes.contains(dev)) {
            participantes.add(dev);
        }
        dev.matricular(this);
    }

    public List<Atividade> getTrilha() {
        return Collections.unmodifiableList(trilha);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }
}
