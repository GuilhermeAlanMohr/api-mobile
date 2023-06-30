package com.example.apimobile.controller;

import com.example.apimobile.model.Farm;
import com.example.apimobile.model.User;
import org.springframework.web.bind.annotation.*;

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
        listFarms.add(new Farm(1l,"Dourados","Guilherme","Venâncio Aires/RS",20, 200.0, -52l, -36l));
        listFarms.add(new Farm(2l,"Pinhais","Paulo","Candelária/RS",20, 200.0, -52l, -36l));
        return listFarms;
    }

    @GetMapping("/fazenda")
    public Farm getFarm(){
        System.out.println("Chamou o método GET uma fazenda");
        return new Farm(1l,"Dourados","Guilherme","Venâncio Aires/RS",20, 200.0, -52l, -36l);
    }

    @PostMapping("/cadastrar")
    public void createFarm(@RequestBody Farm fazenda){
        System.out.println("Chamou o método");
        listFarms.add(fazenda);
    }

}
