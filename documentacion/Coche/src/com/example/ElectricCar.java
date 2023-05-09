package com.example;
//la palabra extends nos permite ir a las otras clases y heradar sus atributos
//por ejemplo podemos crear una clase padre o plantilla y crear otras para heredar y asignar valores especiales
public class ElectricCar extends Coche {
    //esta clase hereda de Coche y le creamos una nueva variable
    String motorElectrico;

    //creamos un constructor a este le creamos una variable y le pasamos el parameyro externo
   public ElectricCar(){
       //super();
       //variabble interna = valor externo
       this.motorElectrico =  motorElectrico;
   }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
