package com.ibm.service;

import com.ibm.model.ClienteEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {
    ClienteEntity findById(int id);
    List<ClienteEntity> findAll();
    ClienteEntity save(ClienteEntity clienteEntity);
    void deleteById(int id);
}
