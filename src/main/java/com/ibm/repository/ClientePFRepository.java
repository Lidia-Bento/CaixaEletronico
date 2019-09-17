package com.ibm.repository;

import com.ibm.model.ClientePFEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientePFRepository extends CrudRepository<ClientePFEntity, Long> {
    ClientePFEntity findById(int id);
    List<ClientePFEntity> findAll();
    ClientePFEntity save(ClientePFEntity cliente_pf);
    void deleteById(int id);
}
