package com.estacio.neto.projetoav1.models;

public class Fornecedor {
    private Integer id;
    private Integer matricula;
    private String nome;
    private String cidade;
    private String estado;

    public Fornecedor(Integer id, Integer matricula, String nome, String cidade, String estado) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Fornecedor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
