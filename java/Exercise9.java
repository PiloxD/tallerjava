package com.taller.java;

import java.util.logging.Logger;
import java.util.Scanner;


public class Exercise9 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);
        logger.info("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        String frase = "La sonrisa sera la mejor arma contra la tristeza";

        frase = frase.replace("a","e");

        logger.info("Nueva frase: "+ frase + " "+ palabra);


        scanner.close();
    }

}
