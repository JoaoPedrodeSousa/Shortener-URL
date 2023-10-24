package com.spring.encurtador.encurtador.config;

import com.spring.encurtador.encurtador.entities.Shortener;
import com.spring.encurtador.encurtador.repositories.ShortenerRepository;
import com.spring.encurtador.encurtador.services.RandomSerial;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ShortenerRepository shortenerRepository;


    @Override
    public void run(String... args) throws Exception {
    Shortener shortener = new Shortener(null, RandomSerial.generate());
    Shortener shortener2 = new Shortener(null, RandomSerial.generate());

    shortenerRepository.save(shortener);
    shortenerRepository.save(shortener2);

    }
}

