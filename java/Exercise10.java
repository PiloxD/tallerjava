package com.taller.java;

import java.util.logging.Logger;
import java.util.Scanner;


public class Exercise10 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);
        logger.info("Ingresa una frase: ");
        String frase = scanner.nextLine();

        frase = frase.replace(" ","");

        logger.info("Nueva frase: " + frase);


        scanner.close();
    }

}
