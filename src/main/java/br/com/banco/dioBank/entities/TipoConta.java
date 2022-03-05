package br.com.banco.dioBank.entities;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class TipoConta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;


}