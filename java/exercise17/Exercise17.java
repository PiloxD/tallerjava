package com.taller.java.exercise17;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;


public class Exercise17 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);
        ArrayList result = new ArrayList<>();
        logger.info("Ingresa un numero del 0 al 1000: ");

        int number = scanner.nextInt();
        for (int i = number; i <= 1000; ) {
            result.add(i);
            i=i+2;
        }
        logger.info("Resultado: "+ result);
    }

}
