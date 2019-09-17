package com.ibm.controller;

import com.ibm.model.ClienteEntity;
import com.ibm.model.ContaEntity;
import com.ibm.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("conta")
public class ContaController {
    @Autowired
    ContaService contaService;

    @GetMapping("list")
    public ResponseEntity<?> listall(){
        return new ResponseEntity<> (contaService.findAll(), HttpStatus.OK);
    }

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody ContaEntity contaEntity){
        return new ResponseEntity<>(contaService.save(contaEntity),HttpStatus.OK);
    }

    @DeleteMapping(path = "/id/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        contaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody ContaEntity contaEntity){
        contaService.save(contaEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
