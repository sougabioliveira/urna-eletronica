package com.urna.urnaeletronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "candidato")
public class Candidato {

    @Id
    @Column(name = "id")
    private Long id;

    @JsonProperty("NomeCompleto")
    private String nomeCompleto;

    @JsonProperty("NomeVice")
    private String nomeVice;

    @JsonProperty("Legenda")
    private Integer legenda;

    @JsonProperty("DataRegistro")
    private LocalDateTime dataRegistro;
}


