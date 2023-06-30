package com.example.apimobile.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Analysis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codAnalysis;
    private String nomeAnalysis;
    private Date dataOrdenha;
    private String testeCaneca;
    private String cmt;
    private Double ccs;
    private Double cbt;
    private String residuosAntibioticos;
    private String sabor;
    private String cor;
    private String odor;
    private String viscusidade;
    private String conservacao;
    @ManyToOne
    private Farm farm;

    public Analysis() {

    }

    public Analysis(Long codAnalysis, String nomeAnalysis, Date dataOrdenha, String testeCaneca, String cmt, Double ccs,
                    Double cbt, String residuosAntibioticos, String sabor, String cor, String odor, String viscusidade,
                    String conservacao, Farm farm) {
        this.codAnalysis = codAnalysis;
        this.nomeAnalysis = nomeAnalysis;
        this.dataOrdenha = dataOrdenha;
        this.testeCaneca = testeCaneca;
        this.cmt = cmt;
        this.ccs = ccs;
        this.cbt = cbt;
        this.residuosAntibioticos = residuosAntibioticos;
        this.sabor = sabor;
        this.cor = cor;
        this.odor = odor;
        this.viscusidade = viscusidade;
        this.conservacao = conservacao;
        this.farm = farm;
    }

    public Analysis(String nomeAnalysis, Date dataOrdenha, String testeCaneca, String cmt, Double ccs,
                    Double cbt, String residuosAntibioticos, String sabor, String cor, String odor, String viscusidade,
                    String conservacao, Farm farm) {
        this.nomeAnalysis = nomeAnalysis;
        this.dataOrdenha = dataOrdenha;
        this.testeCaneca = testeCaneca;
        this.cmt = cmt;
        this.ccs = ccs;
        this.cbt = cbt;
        this.residuosAntibioticos = residuosAntibioticos;
        this.sabor = sabor;
        this.cor = cor;
        this.odor = odor;
        this.viscusidade = viscusidade;
        this.conservacao = conservacao;
        this.farm = farm;
    }

    public Long getCodAnalysis() {
        return codAnalysis;
    }

    public void setCodAnalysis(Long codAnalysis) {
        this.codAnalysis = codAnalysis;
    }

    public String getNomeAnalysis() {
        return nomeAnalysis;
    }

    public void setNomeAnalysis(String nomeAnalysis) {
        this.nomeAnalysis = nomeAnalysis;
    }

    public Date getDataOrdenha() {
        return dataOrdenha;
    }

    public void setDataOrdenha(Date dataOrdenha) {
        this.dataOrdenha = dataOrdenha;
    }

    public String getTesteCaneca() {
        return testeCaneca;
    }

    public void setTesteCaneca(String testeCaneca) {
        this.testeCaneca = testeCaneca;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public Double getCcs() {
        return ccs;
    }

    public void setCcs(Double ccs) {
        this.ccs = ccs;
    }

    public Double getCbt() {
        return cbt;
    }

    public void setCbt(Double cbt) {
        this.cbt = cbt;
    }

    public String getResiduosAntibioticos() {
        return residuosAntibioticos;
    }

    public void setResiduosAntibioticos(String residuosAntibioticos) {
        this.residuosAntibioticos = residuosAntibioticos;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOdor() {
        return odor;
    }

    public void setOdor(String odor) {
        this.odor = odor;
    }

    public String getViscusidade() {
        return viscusidade;
    }

    public void setViscusidade(String viscusidade) {
        this.viscusidade = viscusidade;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

}