package com.ibm.service;

import com.ibm.model.ContaEntity;
import com.ibm.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaServiceImpl implements ContaService {
    @Autowired
    ContaRepository contaRepository;

    @Override
    public ContaEntity findById(int id){ return contaRepository.findById(id);}

    @Override
    public List<ContaEntity> findAll(){ return (List<ContaEntity>) contaRepository.findAll(); }

    @Override
    public ContaEntity save(ContaEntity conta){return contaRepository.save(conta);}

    @Override
    public void deleteById(int id){contaRepository.deleteById(id);}

}
