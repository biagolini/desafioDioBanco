package br.com.banco.dioBank.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idTipoConta;

    private Double saldo;

    @ManyToOne
    private Cliente cliente;

    private Boolean isActive;

}
