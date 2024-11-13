package com.corgi.challengeAlura.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Datos(
       @JsonAlias("results") List<LibroDatos> results
) {
}