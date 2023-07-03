package com.example.apimobile.dao;

import com.example.apimobile.model.Farm;
import com.example.apimobile.repository.FarmRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmDAO {

    private FarmRepository farmRepository;

    public FarmDAO(FarmRepository farmRepository){
        this.farmRepository = farmRepository;
    }

    public Farm insertFarm(Farm farm){
        return this.farmRepository.save(farm);
    }

    public List<Farm> getAllFarms() {
        return this.farmRepository.findAll();
    }

    public Optional<Farm> getFarm(Long codigo){
        return this.farmRepository.findById(codigo);
    }
}
