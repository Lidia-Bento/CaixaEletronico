package com.ibm.controller;

import com.ibm.model.ClientePJEntity;
import com.ibm.service.ClientePJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cliente_pj")
public class ClientePJController {
    @Autowired
    ClientePJService clientePJService;

    @GetMapping("list")
    public ResponseEntity<?> listall(){
        return new ResponseEntity<> (clientePJService.findAll(), HttpStatus.OK);
    }

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody ClientePJEntity clientePJEntity){
        return new ResponseEntity<>(clientePJService.save(clientePJEntity),HttpStatus.OK);
    }

    @DeleteMapping(path = "/id/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        clientePJService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody ClientePJEntity clientePJEntity){
        clientePJService.save(clientePJEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
