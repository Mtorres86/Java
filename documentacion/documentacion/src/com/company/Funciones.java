package com.company;

public class Funciones {
    public static void main(String[] args) {

        //invocamos la funcion llamada Hola mundo
       // holaMundo();
        //invocamos la funcion y le pasamos parametros, el parametro se envia a la funcion.

       // holaMundo("Moises");
       // holaMundo("Alejandra");

        //sobrecarga de funciones invocadas
        holaMundo("Moises");
        holaMundo("Moises", "Torres");
        holaMundo(7);




    }
    // Modificar private es la visibilidad y sera accesible desde la misma clase
    // Modifador public si la clase es publica podria ser vista desde otras clases
    // modificador protected significa que podra ser visible solo para todas las clases que estan en el mismo paquete.

    //sobrecarga de funciones, es cuando la invocamos varias veces y no da errores
    private static void holaMundo(String name) {
        System.out.println("Hola "+ name);

    }
    private static void holaMundo(String name, String surname){
        System.out.println("Nombre y apellido "+ name + " "+surname);
    }
    private static void holaMundo(Integer Number){
        System.out.println("El numero es: "+ Number);

    }

    //funciones son agrupaciones de sentencias para ser reutilizadas en nuestra programa.
    //creamos un mentodo funcion
    private static void holaMundo() {
        System.out.println("Hola mundo desde un metodo");
        System.out.println("Hola mundo desde un metodo");

    }






}
