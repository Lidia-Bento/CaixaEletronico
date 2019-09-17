package com.ibm;

import com.ibm.model.ClienteEntity;
import com.ibm.model.ClientePFEntity;
import com.ibm.model.ClientePJEntity;
import com.ibm.model.ContaEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.ibm.repository")
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.ibm")
@EntityScan(basePackageClasses = {ClienteEntity.class, ClientePFEntity.class, ClientePJEntity.class, ContaEntity.class})
@SpringBootApplication
public class ApplicationController {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationController.class, args);
    }

    //public void calculaTaxaAdmin(double salario){
      //  if(salario == 0) {
        //    System.out.println("Impossivel efetuar essa operacao");
        //}else{
          //  salario +=salario;
            //System.out.println(salario);
        //}
    //}
}

