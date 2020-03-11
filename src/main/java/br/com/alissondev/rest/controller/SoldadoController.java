package br.com.alissondev.rest.controller;

import br.com.alissondev.rest.dto.Soldado;
import br.com.alissondev.rest.service.SoldadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    @Autowired
    private SoldadoService soldadoService;

    @GetMapping("/{cpf}")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable String cpf) {

        final Soldado soldado = soldadoService.buscarSoldado(cpf)

        return ResponseEntity.ok().body(soldado);
    }
}
