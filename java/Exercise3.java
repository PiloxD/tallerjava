package com.taller.java;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);

        logger.info("Ingresa el radio: ");
        String radio = scanner.nextLine();

        Double area = Math.PI*(Double.parseDouble(radio))*(Double.parseDouble(radio));

        logger.info("el area es: " + area);
        
    }
    
}
