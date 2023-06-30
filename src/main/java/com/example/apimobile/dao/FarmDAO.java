package com.example.apimobile.dao;

import com.example.apimobile.model.Farm;
import com.example.apimobile.repository.FarmRepository;
import org.springframework.stereotype.Service;

@Service
public class FarmDAO {

    private FarmRepository farmRepository;

    public FarmDAO(FarmRepository farmRepository){
        this.farmRepository = farmRepository;
    }

    public Farm insertFarm(Farm farm){
        return this.farmRepository.save(farm);
    }

}
