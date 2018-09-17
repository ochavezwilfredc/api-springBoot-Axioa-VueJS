package com.biosis.apireniec.testreniec;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("/api/persona")
public class PersonaResource {
    private final PersonaRepository personaRepository;

    public PersonaResource(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @GetMapping
    public List<Persona> personaList(){
        return personaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Persona> personaCreate(@RequestBody Persona persona){
        Persona nueva = personaRepository.save(persona);
        return ResponseEntity.ok(nueva);
    }



}
