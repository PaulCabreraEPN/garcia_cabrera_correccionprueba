package org.example;
import java.util.Scanner;

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

    //metodos personalizados

    //.Modificar los objetos previamente creados.

    public void editar_objetos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese los nuevos valores para su Objeto");
        System.out.println("Nuevo Nombre:" );
        this.nombre=sc.nextLine();
        System.out.println("Nueva Dirección:" );
        this.direccion=sc.nextLine();
        System.out.println("Nuevo Numero de habitaciones:" );
        this.numero_habitaciones= sc.nextInt();
        System.out.println("Nuevo Precio por noches:" );
        this.precio_noche= sc.nextDouble();
        System.out.println("Tiene piscina:" );
        this.piscina=sc.hasNextBoolean();
    }

    //b.Imprimir todos los objetos.

    public void imprimir_datos_hotel(){
        System.out.println("Nombre: " +this.getNombre());
        System.out.println("Dirección: " +this.getDireccion());
        System.out.println("Numero de habitaciones: " +this.getNumero_habitaciones());
        System.out.println("Precio por noches: " +this.getPrecio_noche());
        System.out.println("Tiene piscina: " +this.getPiscina());
    }
}



