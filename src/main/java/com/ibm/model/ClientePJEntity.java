package com.ibm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ClientePJ")
public class ClientePJEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cnpj;
    private LocalDateTime dataAbertura;
    private String banco;
    private LocalDateTime dataAdesao;

   @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "cliente_id")
    private ContaEntity cliente_id;
}
