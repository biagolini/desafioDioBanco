package br.com.banco.dioBank.controller;

import br.com.banco.dioBank.controller.dto.ContaDto;
import br.com.banco.dioBank.services.OperacoesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("operacoes")
@AllArgsConstructor
public class OperacoesController {

    private final OperacoesService operacoesService;

    @GetMapping("consultaConta/{id}")
    public ResponseEntity<?> consultaConta(@PathVariable Long id) {
        ContaDto searchData = this.operacoesService.consultaConta(id);
        return ResponseEntity.status(HttpStatus.OK).body(searchData);
    }

    @PutMapping("status/{id}")
    public ResponseEntity<?> activeConta(@PathVariable Long id) {
        this.operacoesService.activeConta(id);
        return ResponseEntity.status(HttpStatus.OK).body("Conta ativada com sucesso");
    }

    @DeleteMapping("status/{id}")
    public ResponseEntity<?> inactiveConta(@PathVariable Long id) {
        this.operacoesService.inactiveConta(id);
        return ResponseEntity.status(HttpStatus.OK).body("Conta desativada com sucesso");
    }




}
