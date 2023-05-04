package com.herencia;


//esta heredara de la clase prinicpal que es coche, seria la clase padre y esta la clase hija o derivada.
// en esta clase la heredaramos el metodo de la clase prinicpal  Coche.
public class CocheElectrico extends Coche {
    //creamos los atributos propios de la clase hija
   String motorElectrico;

   //creamos un costructor para esta clase hija

   public CocheElectrico(String motorElectrico) {

       this.motorElectrico = motorElectrico;;
    }

    //metodo super creamos un costructor con los paramateros de la clase padre y la propia de la case hija
    public CocheElectrico(String marca, String modelo,String color,String motorElectrico) {
       // en este costrictor usamos el metodo super() que es invoar a un constructor del la clase padre
       super(marca, modelo,color);
       this.motorElectrico = motorElectrico;
    }

    //creamos un constructor para esta clase hija y es la mismoa de la clase padre
    // esto para sobrescribir el metodo de la clase padre

//llammamos el metodo acelerar que es la clase padre
    // y dobre escribirmos
    @Override
    public void acelerar(Integer cantidad) {
       //creamos un atributo para este metodo principal
        //le asigamos un valor
       Integer cantidadAcelerada = cantidad * 2;
       //se lo pasamos al metodo acelerar principal y este se va a sobre escribir
        super.acelerar(cantidadAcelerada);
    }

    //este metodo devuelve los valorew de la clase pasdre como las de las hijas, podemos quitar o poner las que deseamos llamar de  la clase padre.
    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
