package com.spring.encurtador.encurtador.entities;

import com.spring.encurtador.encurtador.services.RandomSerial;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "tb_shortner")
public class Shortener implements Serializable {

    private static final Long serialVersionUUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String originUrl;
    @Column(unique = true)
    private String shortnerUrl;
    private Calendar originDate = Calendar.getInstance();

    private Calendar lastAcess;
    private Calendar limitDate;

    public Shortener(Long id, String originUrl) {
        Calendar calendar = Calendar.getInstance();

        this.id = id;
        this.originUrl = originUrl;
        this.lastAcess = calendar;
        calendar.add(Calendar.MONTH,1);
        this.limitDate = calendar;
        shortnerUrl = RandomSerial.generate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    public String getShortnerUrl() {
        return shortnerUrl;
    }

    public void setShortnerUrl(String shortnerUrl) {
        this.shortnerUrl = shortnerUrl;
    }

    public Calendar getOriginDate() {
        return originDate;
    }

    public void setOriginDate(Calendar originDate) {
        this.originDate = originDate;
    }

    public Calendar getLastAcess() {
        return lastAcess;
    }

    public void setLastAcess(Calendar lastAcess) {
        this.lastAcess = lastAcess;
    }

    public Calendar getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Calendar limitDate) {
        this.limitDate = limitDate;
    }
}
