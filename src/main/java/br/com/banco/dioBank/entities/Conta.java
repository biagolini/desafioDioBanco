package br.com.banco.dioBank.entities;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idTipoConta;

    private Double saldo;

    @ManyToOne
    private Cliente cliente;

}
