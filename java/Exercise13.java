package com.taller.java;

import java.util.logging.Logger;
import java.time.*;
import java.time.format.*;

public class Exercise13 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("logs");
        LocalDateTime fecha = LocalDateTime.now();

        DateTimeFormatter isoFecha = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(fecha.format(isoFecha));

        DateTimeFormatter isoHora = DateTimeFormatter.ISO_LOCAL_TIME;
        logger.info("La fecha y hora es: "+fecha.format(isoFecha)+fecha.format(isoHora));
    }

}
