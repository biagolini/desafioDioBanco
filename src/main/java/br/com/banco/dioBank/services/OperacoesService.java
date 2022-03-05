package br.com.banco.dioBank.services;

import br.com.banco.dioBank.controller.dto.ContaDto;
import br.com.banco.dioBank.entities.Conta;
import br.com.banco.dioBank.entities.TipoConta;
import br.com.banco.dioBank.repository.ContaRepository;
import br.com.banco.dioBank.repository.TipoContaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@Service
public class OperacoesService {

    private final ContaRepository contaRepository;

    private final TipoContaRepository tipoContaRepository;

    public ContaDto consultaConta(Long id) {
        Conta conta = contaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        TipoConta tipoConta = tipoContaRepository.findById(conta.getIdTipoConta() ).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return (new ContaDto(conta, tipoConta));
    }

    public void activeConta(Long id) {
        Conta conta = contaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        conta.setIsActive(true);
        contaRepository.save(conta);
    }

    public void inactiveConta(Long id) {
        Conta conta = contaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        conta.setIsActive(false);
        contaRepository.save(conta);
    }

}
