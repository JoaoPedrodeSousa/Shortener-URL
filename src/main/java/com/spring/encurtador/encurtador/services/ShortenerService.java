package com.spring.encurtador.encurtador.services;

import com.spring.encurtador.encurtador.entities.Shortener;
import com.spring.encurtador.encurtador.repositories.ShortenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShortenerService {
    @Autowired
    private ShortenerRepository shortenerRepository;

    public Shortener findById(Long id){
        Optional<Shortener> result = shortenerRepository.findById(id);
        return result.get();
    }

    public void deleteById(Long id){
        shortenerRepository.deleteById(id);
    }

    public Shortener findByShortnerUrl(String shortener){
        Shortener result = shortenerRepository.findByShortnerUrl(shortener);
        return result;
    };

}
