package com.example.apimobile.model;

public class Farm {

    private int codFarm;
    private String nomeFarm;
    private String nomeDonoFarm;
    private String cidade;
    private int quantidadeAnimais;
    private Double tamanho;
    private Localizacao localizacao;

    public Farm(int codFarm, String nomeFarm, String nomeDonoFarm, String cidade, int quantidadeAnimais, Double tamanho, Localizacao localizacao) {
        this.codFarm = codFarm;
        this.nomeFarm = nomeFarm;
        this.nomeDonoFarm = nomeDonoFarm;
        this.cidade = cidade;
        this.quantidadeAnimais = quantidadeAnimais;
        this.tamanho = tamanho;
        this.localizacao = localizacao;
    }

    public Farm(String nomeFarm, String nomeDonoFarm, String cidade, int quantidadeAnimais, Double tamanho, Localizacao localizacao) {
        this.nomeFarm = nomeFarm;
        this.nomeDonoFarm = nomeDonoFarm;
        this.cidade = cidade;
        this.quantidadeAnimais = quantidadeAnimais;
        this.tamanho = tamanho;
        this.localizacao = localizacao;
    }

    public int getCodFarm() {
        return codFarm;
    }

    public void setCodFarm(int codFarm) {
        this.codFarm = codFarm;
    }

    public String getNomeFarm() {
        return nomeFarm;
    }

    public void setNomeFarm(String nomeFarm) {
        this.nomeFarm = nomeFarm;
    }

    public String getNomeDonoFarm() {
        return nomeDonoFarm;
    }

    public void setNomeDonoFarm(String nomeDonoFarm) {
        this.nomeDonoFarm = nomeDonoFarm;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    public void setQuantidadeAnimais(int quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}