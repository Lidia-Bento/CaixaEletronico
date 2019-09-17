package com.ibm.service;

import com.ibm.model.ClientePFEntity;
import com.ibm.repository.ClientePFRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientePFServiceImpl implements ClientePFService {
    @Autowired
    ClientePFRepository clientePFRepository;

    @Override
    public ClientePFEntity findById(int id){ return clientePFRepository.findById(id);}

    @Override
    public List<ClientePFEntity> findAll(){ return (List<ClientePFEntity>) clientePFRepository.findAll(); }

    @Override
    public ClientePFEntity save(ClientePFEntity clientePF){ return clientePFRepository.save(clientePF);}

    @Override
    public void deleteById(int id){ clientePFRepository.deleteById(id);}

}
