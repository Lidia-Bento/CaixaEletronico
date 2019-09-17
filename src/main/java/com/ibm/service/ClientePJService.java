package com.ibm.service;

import com.ibm.model.ClientePJEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientePJService {
    ClientePJEntity findById(int id);
    List<ClientePJEntity> findAll();
    ClientePJEntity save(ClientePJEntity clientePJEntity);
    void deleteById(int id);
}
