package com.bootcamp.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desenvolvedor {

    private final String nome;
    private final List<Atividade> pendentes = new ArrayList<>();
    private final List<Atividade> finalizadas = new ArrayList<>();

    public Desenvolvedor(String nome) {
        this.nome = nome;
    }

    public void matricular(Bootcamp bootcamp) {
        for (Atividade atividade : bootcamp.getTrilha()) {
            if (!pendentes.contains(atividade) && !finalizadas.contains(atividade)) {
                pendentes.add(atividade);
            }
        }
    }

    public void avancar() {
        if (pendentes.isEmpty()) {
            System.out.println(nome + " não possui atividades pendentes.");
            return;
        }
        Atividade concluida = pendentes.remove(0);
        finalizadas.add(concluida);
    }

    public double calcularXpTotal() {
        double total = 0;
        for (Atividade atividade : finalizadas) {
            total += atividade.obterXp();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public List<Atividade> getPendentes() {
        return Collections.unmodifiableList(pendentes);
    }

    public List<Atividade> getFinalizadas() {
        return Collections.unmodifiableList(finalizadas);
    }
}
