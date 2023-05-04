package com.example;

public class CocheMain {
    public static void main(String[] args) {
        Coche coche = new Coche("Rojo", "PickUp", "Toyota");
       //accedemos al metodo acelerar y le pasamos un parametro
        coche.acelerar(50);
        System.out.println(coche);

        coche.color="Azul";
        System.out.println(coche);;


    }
}
