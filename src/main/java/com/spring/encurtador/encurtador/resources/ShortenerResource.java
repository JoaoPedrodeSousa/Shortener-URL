package com.spring.encurtador.encurtador.resources;

import com.spring.encurtador.encurtador.entities.Shortener;
import com.spring.encurtador.encurtador.repositories.ShortenerRepository;
import com.spring.encurtador.encurtador.services.ShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShortenerResource {
    @Autowired
    private ShortenerRepository repository;

    @GetMapping(value = "/{shortnerUrl}")
    public ResponseEntity<Shortener> gerShort(@PathVariable String shortnerUrl){
        Shortener result = repository.findByShortnerUrl(shortnerUrl);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Shortener> findById(@PathVariable Long id){
        Optional<Shortener> shortener = repository.findById(id);
        return ResponseEntity.ok().body(shortener.get());
    }
}
