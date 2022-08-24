package com.urna.urnaeletronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Candidato {

    @JsonProperty("nome")
    private String nome;
}


