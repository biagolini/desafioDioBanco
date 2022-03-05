package br.com.banco.dioBank.repository;

import br.com.banco.dioBank.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository  extends JpaRepository<Conta,Long>{

}
