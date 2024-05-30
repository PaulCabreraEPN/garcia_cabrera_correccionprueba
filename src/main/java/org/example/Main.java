package org.example;
public class Main {
    public static void main(String[] args) {
        //Desde el main creo 5 instancias de la clase (queme los valores)
        Hoteles instancia1=new Hoteles("La Paz","Chillogallo",100,9.4,true);
        Hoteles instancia2=new Hoteles("Amanecer","Solanda",150,19.24,true);
        Hoteles instancia3=new Hoteles("Palmeras","La Tola",200,20.50,false);
        Hoteles instancia4=new Hoteles("Vista al Mar","El Conde",175,30.10,false);
        Hoteles instancia5=new Hoteles("Cielo Azul","Quitumbe",10,8.75,true);

        //Desde el main cree dos objetos con valores nulos y posteriormente setee sus valores.
        Hoteles Hotel1=new Hoteles();
        Hotel1.setNombre("Casa Blanca");
        Hotel1.setDireccion("La Carolina");
        Hotel1.setNumero_habitaciones(100);
        Hotel1.setPrecio_noche(16.7);
        Hotel1.setPiscina(true);
        Hotel1.imprimir_datos_hotel();

        Hoteles Hotel2=new Hoteles();
        Hotel2.setNombre("Sirena");
        Hotel2.setDireccion("La Magdalena");
        Hotel2.setNumero_habitaciones(50);
        Hotel2.setPrecio_noche(18.90);
        Hotel2.setPiscina(false);
        Hotel2.imprimir_datos_hotel();

        //c.Modificar todos los atributos de al menos tres objetos con el valor de NULL y mostrar su nuevo valor.
        Hoteles Hotel3=new Hoteles();
        Hotel3.editar_objetos();
        Hotel3.imprimir_datos_hotel();
        Hoteles Hotel4=new Hoteles();
        Hotel4.editar_objetos();
        Hotel4.imprimir_datos_hotel();
        Hoteles Hotel5=new Hoteles();
        Hotel5.editar_objetos();
        Hotel5.imprimir_datos_hotel();

    };
}