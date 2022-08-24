package com.urna.urnaeletronica.controller;


import com.urna.urnaeletronica.model.Candidato;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @GetMapping
    public ResponseEntity<Candidato> getAll() {
        Candidato candidato = new Candidato();
        candidato.setNome("Candidato 1");
        return ResponseEntity.ok(candidato);
    }
}
