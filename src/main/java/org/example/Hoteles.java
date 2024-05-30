package org.example;

public class Hoteles {
    String nombre;
    String direccion;
    int numero_habitaciones;
    double precio_noche;
    boolean piscina;

    //constructores

    public Hoteles(){
    }

    public Hoteles(String nombre, String direccion, int numero_habitaciones, double precio_noche, boolean piscina) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero_habitaciones = numero_habitaciones;
        this.precio_noche = precio_noche;
        this.piscina = piscina;
    }
}
