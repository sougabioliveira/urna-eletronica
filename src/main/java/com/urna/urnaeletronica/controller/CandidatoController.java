package com.urna.urnaeletronica.controller;


import com.urna.urnaeletronica.model.Candidato;
import com.urna.urnaeletronica.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @GetMapping
    public ResponseEntity<List<Candidato>> getAll() {
        List<Candidato> candidatos = candidatoRepository.findAll();
        return ResponseEntity.ok(candidatos);
    }
}
