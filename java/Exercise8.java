package com.taller.java;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);
        boolean estado = true;

        do {
            logger.info(
                    "DÍAS DE LA SEMANA: \n 0. SALIR \n 1.Lunes\n 2.Martes\n 3.Miércoles\n 4.Jueves\n 5.Viernes\n 6. Sábado \n 7. Domingo");
            logger.info("Escoja el número del día que quiere ingresar: ");
            String day = scanner.nextLine();
            switch (day) {
                case "1":
                    logger.info("Es un día laboral");

                    break;
                case "2":
                    logger.info("Es un día laboral");

                    break;
                case "3":
                    logger.info("Es un día laboral");

                    break;
                case "4":
                    logger.info("Es un día laboral");

                    break;
                case "5":
                    logger.info("Es un día laboral");

                    break;
                case "6":
                    logger.info("NO es un día laboral");

                    break;
                case "7":
                    logger.info("NO es un día laboral");

                    break;
                case "0":
                    estado = false;
                    logger.info("Adiós");
                    break;

            }
        } while (estado);

        scanner.close();
    }

}
