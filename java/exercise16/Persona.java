package com.taller.java.exercise16;

public class Persona {
    private String nombre;
    private int edad;
    private int DNI = 111111;
    private String sexo =  hombre;
    private Double peso;
    private Double estatura;

    public Persona(){}

    public Persona(String nombreNuevo, int edadNueva, String sexoNuevo){
        nombre = nombreNuevo;
        edad = edadNueva;
        sexo = sexoNuevo;
    }

    public Persona(String nombreNuevo, int edadNueva, int nuevoDNI, String sexoNuevo, Double pesoNuevo, Double estaturaNueva){
        nombre = nombreNuevo;
        edad = edadNueva;
        DNI = nuevoDNI;
        sexo = sexoNuevo;
        peso = pesoNuevo;
        estatura = estaturaNueva;
    }

    public Double calcularIMC(){
        

    }


    
}
