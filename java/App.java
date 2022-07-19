package com.taller.java;

import java.util.logging.Logger;


public class App {

    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger("CUALQUIER_NOMBRE");
        
        String str = "aaaaaaa";
        logger.info(str);
    }
}
