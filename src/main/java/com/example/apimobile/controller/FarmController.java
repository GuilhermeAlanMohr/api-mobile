package com.example.apimobile.controller;

import com.example.apimobile.model.Farm;
import com.example.apimobile.model.Localizacao;
import com.example.apimobile.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("fazenda")
public class FarmController {

    private ArrayList<Farm> listFarms = new ArrayList<Farm>();

    @GetMapping("/fazendas")
    public List<Farm> getFarms(){
        //int codFarm, String nomeFarm, String nomeDonoFarm, String cidade, int quantidadeAnimais,
        //Double tamanho, Localizacao localizacao
        listFarms.add(new Farm(1,"Dourados","Guilherme","Venâncio Aires/RS",20, 200.0, new Localizacao((long) -52.22, (long) -36.00,  (long) 0.0)));
        listFarms.add(new Farm(2,"Pinhais","Paulo","Candelária/RS",20, 200.0, new Localizacao((long) -52.22, (long) -36.00,  (long) 0.0)));
        return listFarms;
    }

    @GetMapping("/fazenda")
    public Farm getFarm(){
        System.out.println("Chamou o método GET uma fazenda");
        return new Farm(1,"Dourados","Guilherme","Venâncio Aires/RS",20, 200.0, new Localizacao((long) -52.22, (long) -36.00,  (long) 0.0));
    }

    @PostMapping("/cadastrar")
    public void createFarm(Farm fazenda){
        System.out.println("Chamou o método");
        listFarms.add(fazenda);
    }

}
