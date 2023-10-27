package com.spring.encurtador.encurtador.repositories;

import com.spring.encurtador.encurtador.entities.Shortener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShortenerRepository extends CrudRepository JpaRepository<Shortener, Long> {

    Shortener findByShortnerUrl(String shortener);
}
