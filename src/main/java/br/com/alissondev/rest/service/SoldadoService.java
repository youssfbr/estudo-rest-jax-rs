package br.com.alissondev.rest.service;

import br.com.alissondev.rest.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flecha");
        return soldado;
    }
}
