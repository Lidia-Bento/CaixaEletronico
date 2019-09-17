package com.ibm.service;

import com.ibm.model.ClientePFEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientePFService {
    ClientePFEntity findById(int id);
    List<ClientePFEntity> findAll();
    ClientePFEntity save(ClientePFEntity clientePFEntity);
    void deleteById(int id);
}
