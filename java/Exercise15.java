package com.taller.java;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        Scanner scanner = new Scanner(System.in);
        boolean estado = true;

        do {
            logger.info(
                    "DÍAS DE LA SEMANA:  \n 1.NUEVO ACTOR\n 2.BUSCAR ACTOR\n 3.ELIMINAR ACTOR\n 4.MODIFICAR ACTOR\n 5.VER TODOS LOS ACTORES\n 6. VER PELICULAS DE LOS ACTORES \n 7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n 8. SALIR");
            logger.info("Escriba el número de la acción a seguir: ");
            String day = scanner.nextLine();
            switch (day) {
                case "1":
                    logger.info("NUEVO ACTOR");

                    break;
                case "2":
                    logger.info("BUSCAR ACTOR");

                    break;
                case "3":
                    logger.info("ELIMINAR ACTOR");

                    break;
                case "4":
                    logger.info("MODIFICAR ACTOR");

                    break;
                case "5":
                    logger.info("VER TODOS LOS ACTORES");

                    break;
                case "6":
                    logger.info("VER PELICULAS DE LOS ACTORES");

                    break;
                case "7":
                    logger.info("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");

                    break;
                case "8":
                    estado = false;
                    logger.info("Adiós");
                    break;

            }
        } while (estado);

        scanner.close();
    }

}
