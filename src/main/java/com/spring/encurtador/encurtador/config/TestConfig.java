package com.spring.encurtador.encurtador.config;

import com.spring.encurtador.encurtador.entities.Shortener;
import com.spring.encurtador.encurtador.repositories.ShortenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ShortenerRepository shortenerRepository;


    @Override
    public void run(String... args) throws Exception {
    Shortener shortener = new Shortener(null,"www.google.com.br");
    Shortener shortener2 = new Shortener(null,"www.youtube.com.br");

    shortenerRepository.save(shortener);
    shortenerRepository.save(shortener2);

    }
}

