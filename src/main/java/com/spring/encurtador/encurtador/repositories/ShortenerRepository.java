package com.spring.encurtador.encurtador.repositories;

import com.spring.encurtador.encurtador.entities.Shortener;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShortenerRepository extends JpaRepository<Shortener, Long> {
}
