# desafio-poo-dio

Modelagem **orientada a objetos** de um bootcamp de desenvolvimento: cursos, mentorias, desenvolvedores e conteúdos inscritos — com encapsulamento e composição.

Desafio da **DIO** em Java puro, sem frameworks.

## Stack

- Java · POO (herança, composição, encapsulamento)

## Destaques

- Hierarquia `Atividade` → `Curso` / `Mentoria`
- `Bootcamp` agrupa conteúdos e gerencia inscrições de `Desenvolvedor`
- Cálculo de horas totais de conteúdo por dev

## Como rodar

```bash
# IntelliJ / IDE: executar App.java
```

## Estrutura

```
src/com/bootcamp/modelo/
├── Atividade.java      → classe base
├── Curso.java          → carga horária em horas
├── Mentoria.java       → data agendada
├── Desenvolvedor.java  → conteúdos inscritos
└── Bootcamp.java       → orquestra inscrições
```

## Evolução

Conceitos deste projeto evoluem para APIs Spring Boot como [tasks-api-spring](https://github.com/josuelns/tasks-api-spring) e [cloud-parking-spring](https://github.com/josuelns/cloud-parking-spring).

---

[Portfólio](https://josuelns.github.io/) · [GitHub](https://github.com/josuelns)
