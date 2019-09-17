package com.ibm.repository;

import com.ibm.model.ClientePJEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientePJRepository extends CrudRepository<ClientePJEntity, Long> {
    ClientePJEntity findById(int id);
    List<ClientePJEntity> findAll();
    ClientePJEntity save(ClientePJEntity cliente_pj);
    void deleteById(int id);
}
