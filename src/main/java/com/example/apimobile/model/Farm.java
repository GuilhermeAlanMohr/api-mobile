package com.example.apimobile.model;


import javax.persistence.*;

@Entity
public class Farm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codFarm;
    private String nomeFarm;
    private String nomeDonoFarm;
    private String cidade;
    private int quantidadeAnimais;
    private Double tamanho;
    private Double latitude;
    private Double longitude;

    public Farm() {

    }

    public Farm(Long codFarm, String nomeFarm, String nomeDonoFarm, String cidade, int quantidadeAnimais, Double tamanho, Double latitude, Double longitude) {
        this.codFarm = codFarm;
        this.nomeFarm = nomeFarm;
        this.nomeDonoFarm = nomeDonoFarm;
        this.cidade = cidade;
        this.quantidadeAnimais = quantidadeAnimais;
        this.tamanho = tamanho;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Farm(String nomeFarm, String nomeDonoFarm, String cidade, int quantidadeAnimais, Double tamanho, Double latitude, Double longitude ) {
        this.nomeFarm = nomeFarm;
        this.nomeDonoFarm = nomeDonoFarm;
        this.cidade = cidade;
        this.quantidadeAnimais = quantidadeAnimais;
        this.tamanho = tamanho;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getCodFarm() {
        return codFarm;
    }

    public void setCodFarm(Long codFarm) {
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
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}