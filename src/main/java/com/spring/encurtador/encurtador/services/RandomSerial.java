package com.spring.encurtador.encurtador.services;

import java.util.Random;

public class RandomSerial {
    private static final String ALFANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";
    private static final Integer TAMANHO_MAXIMO_URL = 8;

    public static String generate(){

        String serial = "";

        int i;
        for (i=0;i<(TAMANHO_MAXIMO_URL);i++) {
            serial += String.valueOf(
                    ALFANUMERIC.charAt(
                            new Random()
                                    .nextInt(ALFANUMERIC.length()-1)
                    )
            );
        }
        return serial;
    }
}
