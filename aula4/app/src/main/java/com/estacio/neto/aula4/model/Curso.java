package com.estacio.neto.aula4.model;

import com.estacio.neto.aula4.enums.EstadoAtual;

import java.text.MessageFormat;

public class Curso {
    private String nome;
    private String descricao;
    private EstadoAtual estado;

    public Curso(String nome, String descricao, EstadoAtual estado) {
        this.nome = nome;
        this.descricao = descricao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EstadoAtual getEstado() {
        return estado;
    }

    public void setEstado(EstadoAtual estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Curso: {0}\nDescrição: {1}\nEstado: {2}",
                this.getNome(), getDescricao(), getEstado());
    }
}
