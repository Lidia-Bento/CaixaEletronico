package com.ibm.controller;

import com.ibm.model.ClientePFEntity;
import com.ibm.service.ClientePFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cliente_pf")
public class ClientePFController {
    @Autowired
    ClientePFService clientePFService;

    @GetMapping("list")
    public ResponseEntity<?> listall(){
        return new ResponseEntity<> (clientePFService.findAll(), HttpStatus.OK);
    }

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody ClientePFEntity clientePFEntity){
        return new ResponseEntity<>(clientePFService.save(clientePFEntity),HttpStatus.OK);
    }

    @DeleteMapping(path = "/id/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        clientePFService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody ClientePFEntity clientePFEntity){
        clientePFService.save(clientePFEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
