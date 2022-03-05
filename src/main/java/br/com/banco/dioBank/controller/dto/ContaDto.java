package br.com.banco.dioBank.controller.dto;

import br.com.banco.dioBank.entities.Conta;
import br.com.banco.dioBank.entities.TipoConta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContaDto {

    private Long numeroConta;

    private Boolean contaAtiva;

    private String tipoConta;

    private String nomeCliente;

    private Long idAgencia;

    private String nomeAgencia;

    private Double saldo;

    public ContaDto(Conta conta, TipoConta tipoConta) {

        this.numeroConta = conta.getId();

        this.contaAtiva = conta.getIsActive();

        this.tipoConta = tipoConta.getDescription();

        this.nomeCliente = conta.getCliente().getNome();

        this.idAgencia =  conta.getCliente().getAgencia().getId();

        this.nomeAgencia =   conta.getCliente().getAgencia().getNome();

        this.saldo = conta.getSaldo();


    }
}
