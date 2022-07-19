package com.taller.java;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise4 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);

        logger.info("Ingresa el precio: ");
        int precio = scanner.nextInt();
        int iva = (precio*21)/100; 

        int precioFinal = precio + iva;

        logger.info("El precio con IVA es: " + precioFinal);
        scanner.close();
    }
    
}
