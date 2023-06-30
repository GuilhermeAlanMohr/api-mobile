package com.example.apimobile.dao;

import com.example.apimobile.model.Analysis;
import com.example.apimobile.repository.AnalysisRepository;
import org.springframework.stereotype.Service;

@Service
public class AnalysisDAO {

    private final AnalysisRepository analysisRepository;

    public AnalysisDAO (AnalysisRepository analysisRepository){
        this.analysisRepository = analysisRepository;
    }

    public Analysis insertAnalysis (Analysis analysis) {
        return this.analysisRepository.save(analysis);
    }

}
