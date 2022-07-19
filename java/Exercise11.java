package com.taller.java;

import java.util.logging.Logger;


import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);
        logger.info("Ingresa una frase: ");
        String frase = scanner.nextLine();
        int contador = 0;
        int fraseTamaño = frase.length();

        for(int x=0;x<frase.length();x++) {
            if ((frase.charAt(x)=='a') || (frase.charAt(x)=='e') || (frase.charAt(x)=='i') || (frase.charAt(x)=='o') || (frase.charAt(x)=='u')){ 
               contador++;
             }
           }

        logger.info("tamaño de la frase: " + fraseTamaño);
        logger.info("cantidad de vocales " + contador);


        scanner.close();
    }

}
