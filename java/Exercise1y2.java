package com.taller.java;

import java.util.Scanner;
import java.util.logging.Logger;
public class Exercise1y2 {

    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);

       logger.info("Ingresa un número: ");

        int numberA = scanner.nextInt();

        logger.info("Ingresa otro número: ");
        int numberB = scanner.nextInt();

        if (numberA > numberB) {
            logger.info("El número: " + numberA + " es mayor que: " + numberB);
        } else if (numberB > numberA) {
            logger.info("El número: " + numberB + " es mayor que: " + numberA);

        } else {
            logger.info("Son iguales");

        }
        scanner.close();
    }
}