package com.estacio.neto.aula4.enums;

public enum EstadoAtual {
    CONCLUIDO("Concluído"),
    EM_ANDAMENTO("Em Andamento"),
    INSCRICOES_ABERTAS("Inscrições Abertas");

    private final String estadoAtual;

    EstadoAtual(final String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    @Override
    public String toString() {
        return estadoAtual;
    }
}
