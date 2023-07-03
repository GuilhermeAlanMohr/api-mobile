package com.example.apimobile.controller;

import com.example.apimobile.dao.FarmDAO;
import com.example.apimobile.model.Farm;
import com.example.apimobile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("fazenda")
public class FarmController {

    private FarmDAO farmDao;
    private ArrayList<Farm> listFarms = new ArrayList<Farm>();

    @Autowired
    public FarmController(FarmDAO farmDao){
        this.farmDao = farmDao;
    }

    @GetMapping("/fazendas")
    public List<Farm> getFarms(){
        System.out.println("Chamou o método de Listagem das Fazendas cadastradas");
//        listFarms.add(new Farm(1l,"Dourados","Guilherme","Venâncio Aires/RS",20, 200.0, -52l, -36l));
//        listFarms.add(new Farm(2l,"Pinhais","Paulo","Candelária/RS",20, 200.0, -52l, -36l));
//        return listFarms;
        return this.farmDao.getAllFarms();
    }

    @GetMapping("/fazenda")
    public Farm getFarm(@RequestBody Long codigo){
        System.out.println("Chamou o método que Busca uma Fazenda cadastrada");
//        return new Farm(1l,"Dourados","Guilherme","Venâncio Aires/RS",20, 200.0, -52l, -36l);
        Farm farm = this.farmDao.getFarm(codigo) != null ? this.farmDao.getFarm(codigo).get() : null;
        return farm;
    }

    @PostMapping("/cadastrar")
    public Farm createFarm(@RequestBody Farm fazenda){
        System.out.println("Chamou o método de Cadastro de uma Fazenda");
//        listFarms.add(fazenda);
        return this.farmDao.insertFarm(fazenda);
    }

}
