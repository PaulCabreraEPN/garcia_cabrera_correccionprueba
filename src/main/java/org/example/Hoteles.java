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

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero_habitaciones() {
        return numero_habitaciones;
    }
    public void setNumero_habitaciones(int numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public boolean getPiscina() {
        return piscina;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public double getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(double precio_noche) {
        this.precio_noche = precio_noche;

    }
}
