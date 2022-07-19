package com.taller.java;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);
        logger.info("Ingresa un número: ");
        int i = scanner.nextInt();

        do {
            logger.info("El número es: " + i);
            logger.info("Ingresa un número: ");
            i = scanner.nextInt();
        } while (i <= 0);

        scanner.close();
    }

}
