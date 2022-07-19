package com.taller.java;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Exercise6 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        ArrayList pares = new ArrayList<>();
        ArrayList impares = new ArrayList<>();

        for (int i = 0; i<=100; i=i+1) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }
        logger.info("Los impares entre 0 y 100 son: " + impares);
        logger.info("Los pares entre 0 y 100 son: " + pares);

    }

}
