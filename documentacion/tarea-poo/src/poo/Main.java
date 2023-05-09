package poo;

import herencia.SmartPhone;
import herencia.SmartWatch;

public class Main {
    public static void main(String[] args){

        //objeto

        SmartDevice tablet = new SmartDevice();
        tablet.color ="Rojo";
        tablet.tamaño = "12'";


        System.out.println(tablet.color);
        System.out.println(tablet.tamaño);
        tablet.estado  ("Si");
        System.out.println(tablet.disponible);

        //objetos de la herencia
        SmartPhone samsung = new SmartPhone();
        samsung.color = "Blanco";
        samsung.tamaño = "13 pulgadas";
        samsung.estado("Si");
        System.out.println(samsung.disponible);
        System.out.println(samsung.color);
        System.out.println(samsung.tamaño);




        SmartWatch apple= new SmartWatch();
        apple.color = "Rojo";
        apple.tamaño = "Pequeño";
        samsung.estado("No");
        System.out.println(apple.disponible);
        System.out.println(apple.color);
        System.out.println(apple.tamaño);




    }
}
