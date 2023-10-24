package com.spring.encurtador.encurtador.services;

import com.spring.encurtador.encurtador.entities.Shortener;
import com.spring.encurtador.encurtador.repositories.ShortenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public  Shortener findByShortnerUrl(String shortnerUrl){
        Optional<Shortener> result = shortenerRepository.findBy(Shortener,);

    }
}
