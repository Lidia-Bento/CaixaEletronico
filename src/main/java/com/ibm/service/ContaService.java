package com.ibm.service;

import com.ibm.model.ContaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContaService {
    ContaEntity findById(int id);
    List<ContaEntity> findAll();
    ContaEntity save(ContaEntity contaEntity);
    void deleteById(int id);
}
