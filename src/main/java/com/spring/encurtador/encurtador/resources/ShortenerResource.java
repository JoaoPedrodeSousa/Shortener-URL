package com.spring.encurtador.encurtador.resources;

import com.spring.encurtador.encurtador.entities.Shortener;
import com.spring.encurtador.encurtador.repositories.ShortenerRepository;
import com.spring.encurtador.encurtador.services.ShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShortenerResource {
    @Autowired
    private ShortenerRepository repository;

    @GetMapping("/{shortnerUrl}")
    private Shortener newShortner(@PathVariable String shortnerUrl){
        return new ShortenerService().findById(shortnerUrl);
    }
    @PostMapping("/{shortnerUrl}")
    private Shortener newShortner(@RequestBody Shortener shortener){
        return repository.save(shortener);
    }

}
