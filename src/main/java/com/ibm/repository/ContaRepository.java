package com.ibm.repository;

import com.ibm.model.ContaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContaRepository extends CrudRepository<ContaEntity, Long> {
    ContaEntity findById(int id);
    List<ContaEntity> findAll();
    ContaEntity save(ContaEntity conta);
    void deleteById(int id);
}
