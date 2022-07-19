package com.taller.java;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Exercise5 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        int i = 0;
        ArrayList pares = new ArrayList<>();
        ArrayList impares = new ArrayList<>();

        while (i <= 100) {
            if (i % 2 == 0) {
                pares.add(i);
                i++;
            } else {
                impares.add(i);
                i++;
            }
        }
        logger.info("Los impares entre 0 y 100 son: " + impares);
        logger.info("Los pares entre 0 y 100 son: " + pares);

    }

}
