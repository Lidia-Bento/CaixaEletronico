package com.ibm.controller;

import com.ibm.model.ClienteEntity;
import com.ibm.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping("list")
    public ResponseEntity<?> listall(){
        return new ResponseEntity<> (clienteService.findAll(), HttpStatus.OK);
    }

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody ClienteEntity clienteEntity){
        return new ResponseEntity<>(clienteService.save(clienteEntity),HttpStatus.OK);
    }

    @DeleteMapping(path = "/id/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        clienteService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody ClienteEntity clienteEntity){
        clienteService.save(clienteEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
