package com.example;

public class CocheMain {
    public static void main(String[] args) {
        Coche coche = new Coche();
       //accedemos al metodo acelerar y le pasamos un parametro
        coche.acelerar(50);
        System.out.println(coche);

        coche.color="Azul";
        System.out.println(coche);;

        ElectricCar cocheElectrico = new ElectricCar();
        cocheElectrico.motorElectrico = "Ejemplo";
        cocheElectrico.color="Azul";
        cocheElectrico.modelo="Honda";




    }
}
