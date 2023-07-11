package com.example.apimobile.controller;

import com.example.apimobile.dao.AnalysisDAO;
import com.example.apimobile.model.Analysis;
import com.example.apimobile.model.Farm;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("analise")
public class AnalysisController {

    private AnalysisDAO analysisDAO;
    private ArrayList<Analysis> listAnalysis = new ArrayList<>();

    @Autowired
    public AnalysisController(AnalysisDAO analysisDAO) {
        this.analysisDAO = analysisDAO;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/analises")
    public List<Analysis> getAnalysis(){
        System.out.println("Método de Listagem de todas as análises chamado");
//        listAnalysis.add(new Analysis("Análise Teste", Date.from(Instant.now()), "Normal", "Sem alterações", 200.0, 100.0, "Não apresenta", "Normal", "Sem alteração", "Em conformidade", "Não apresenta", "Adequada", new Farm(1l,"Dourados","Guilherme","Venâncio Aires/RS",20, 200.0, -52l, -36l)));
//        listAnalysis.add(new Analysis("Análise Experimental", Date.from(Instant.now()), "Normal", "Sem alterações", 200.0, 100.0, "Não apresenta", "Sem alteração", "Normal", "Em conformidade", "Não apresenta", "Adequada", new Farm(2l,"Pinhais","Paulo","Candelária/RS",20, 200.0, -52l, -36l)));
//        return listAnalysis;
        return this.analysisDAO.getAllAnalysis();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/analise")
    public Analysis getAnalise(@RequestBody Long codigo){
        System.out.println("Método de busca de uma análise chamado");
        Analysis analysis = this.analysisDAO.getAnalysis(codigo) != null ? this.analysisDAO.getAnalysis(codigo).get() : null;
        return analysis;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/cadastrar")
    public Analysis createAnalysis(@RequestBody Analysis analise){
        System.out.println("Chamou o método de Cadastro de Análise");
        Analysis analysisSalva = this.analysisDAO.insertAnalysis(analise);
        if (analysisSalva != null) {
            System.out.println("Análise salva com sucesso");
        } else {
            System.out.println("Erro ao salvar");
        }
        return analysisSalva;
    }

}
