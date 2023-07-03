package com.example.apimobile.dao;

import com.example.apimobile.model.Analysis;
import com.example.apimobile.repository.AnalysisRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnalysisDAO {

    private final AnalysisRepository analysisRepository;

    public AnalysisDAO (AnalysisRepository analysisRepository){
        this.analysisRepository = analysisRepository;
    }

    public Analysis insertAnalysis (Analysis analysis) {
        return this.analysisRepository.save(analysis);
    }

    public Optional<Analysis> getAnalysis(Long codigo) {
        return this.analysisRepository.findById(codigo);
    }

    public List<Analysis> getAllAnalysis() {
        return this.analysisRepository.findAll();
    }

}
