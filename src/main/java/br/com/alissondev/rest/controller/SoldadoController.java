package br.com.alissondev.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    @GetMapping
    public String buscarSoldado() {

        return "Olá soldado";
    }
}
