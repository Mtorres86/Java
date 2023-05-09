package poo.clases;


import herencia.Coche;
import herencia.Motocicleta;

public class Main {

    public static void  main(String[] args){

        //estructura de un objeto
        //NombreClase identificador = operadordeasignacion NombreClase(); << despues del new nos referimos al nombre de los contructores que hemos creado
        //nombreClase(podemos dar control py veremos los atributos del constructor)
        //objeto sin parametros
        Vehiculo  toyotaPrius= new Vehiculo();

        //crear objeto utilizando el contructor con paratmetos
        Motor motorGTI = new Motor("GTI",190,459.0,6);
        Vehiculo fordMondeo = new Vehiculo("Ford","Mondeo",2.2,2010,false,0, motorGTI);
        //aqui imprimimos valores que deseamos o podemos imprimir todo los valores
        System.out.println(fordMondeo.fabric);
        System.out.println(fordMondeo.year);
        //aqui imprimimos el atributo speed sin  enviar su valor
        System.out.println(fordMondeo.speed);
        //aqui llamamos el metodo acelerar y le mandamos un valor
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);

        //verificamos la herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabric = "Honda";

        System.out.println("Fin del programa");

        //polimorfirmos
        //a partir de una forma se pueden tener varias formas
        Vehiculo vehiculo;
        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);
        vehiculo = new Coche();
        vehiculo.acelerar(70);


        //Clases abstractas NO se pueden instancia, solo instacioanmos las clases hijas.

        //public abstract class NombreClase{}

        //modificardor static lo que dice es que el metodo pertenece a la clase y no a los objetos

    }
}
