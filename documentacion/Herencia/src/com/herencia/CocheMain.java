package com.herencia;

public class CocheMain {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "PickUp","Amarillo");
        coche.acelerar(50);
        System.out.println(coche);

        //instanciamos o creamos un objeto de la lcase hija
        CocheElectrico cocheElectrico = new CocheElectrico("Tesla");
        //cocheElectrico.motorElectrico="Tesla";
        cocheElectrico.color ="Verde";
        cocheElectrico.modelo=("Turismo");
        cocheElectrico.marca=("Tesla");
        cocheElectrico.acelerar(50);
        System.out.println(cocheElectrico);

        //creamos un objeto de la clase hija con el metodo super
        CocheElectrico cocheElectrico2 = new CocheElectrico("Toyota","Sedan","Rojo", "Tesla");
        System.out.println(cocheElectrico2);
    }
}
