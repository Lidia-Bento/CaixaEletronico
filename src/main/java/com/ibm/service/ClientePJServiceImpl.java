package com.ibm.service;

import com.ibm.model.ClientePJEntity;
import com.ibm.repository.ClientePJRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientePJServiceImpl implements ClientePJService{
    @Autowired
    ClientePJRepository clientePJRepository;

    @Override
    public ClientePJEntity findById(int id){ return clientePJRepository.findById(id);}

    @Override
    public List<ClientePJEntity> findAll(){ return (List<ClientePJEntity>) clientePJRepository.findAll();}

    @Override
    public ClientePJEntity save(ClientePJEntity clientePJ){return clientePJRepository.save(clientePJ);}

    @Override
    public void deleteById(int id){ clientePJRepository.deleteById(id);}
}
