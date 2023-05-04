package com.structcontrol;

public class CocheMain {
    public static void main(String[] args) {
        //punto de entrada de la aplicacion
        //tipo de dato - identifador = valor que toma el identificador
        String coche = "alfa romeo";
        //creamos un objeto de la clase Coche, entre parantesis le pasamos los argumentos que tiene la clase
        //un objeto o instanciar en resumen es que invocamos el metodo de la clase.
        Coche coche1 = new Coche("rojo","Alfa","Turismo",76.99,15.16);
        coche1.acelerar(50);
        System.out.println(coche1);





    }
}
