package com.example.apimobile.controller;

import com.example.apimobile.model.Analysis;
import com.example.apimobile.model.Farm;
import com.example.apimobile.model.Localizacao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("analise")
public class AnalysisController {
    
    private ArrayList<Analysis> listAnalysis = new ArrayList<>();

    @GetMapping("/analises")
    public List<Analysis> getAnalysis(){
        //int codAnalysis, String nomeAnalysis, Date dataOrdenha, String testeCaneca, String cmt, Double ccs,
        //Double cbt, String residuosAntibioticos, String sabor, String cor, String odor, String viscusidade,
        //String conservacao, Farm farm
        listAnalysis.add(new Analysis(1, "Análise Teste", Date.from(Instant.now()), "Normal", "Sem alterações", 200.0, 100.0, "Não apresenta", "Normal", "Sem alteração", "Em conformidade", "Não apresenta", "Adequada", new Farm(1,"Dourados","Guilherme","Venâncio Aires/RS",20, 200.0, new Localizacao((long) -52.22, (long) -36.00,  (long) 0.0))));
        listAnalysis.add(new Analysis(2, "Análise Experimental", Date.from(Instant.now()), "Normal", "Sem alterações", 200.0, 100.0, "Não apresenta", "Sem alteração", "Normal", "Em conformidade", "Não apresenta", "Adequada", new Farm(2,"Pinhais","Paulo","Candelária/RS",20, 200.0, new Localizacao((long) -52.22, (long) -36.00,  (long) 0.0))));
        return listAnalysis;
    }

    @GetMapping("/analise")
    public Analysis getAnalise(){
        System.out.println("Chamou o método GET uma fazenda");
        return new Analysis(2, "Análise Experimental", Date.from(Instant.now()), "Normal", "Sem alterações", 200.0, 100.0, "Não apresenta", "Sem alteração", "Normal", "Em conformidade", "Não apresenta", "Adequada", new Farm(2,"Pinhais","Paulo","Candelária/RS",20, 200.0, new Localizacao((long) -52.22, (long) -36.00,  (long) 0.0)));
    }

    @PostMapping("/cadastrar")
    public void createAnalysis(Analysis analise){
        System.out.println("Chamou o método");
        listAnalysis.add(analise);
    }

}
