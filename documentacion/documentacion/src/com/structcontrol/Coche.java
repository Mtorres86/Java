package com.structcontrol;

public class Coche {
    //atributos > caracteristica de un coche que varianm entre uno y otro, color, tipo, peso.
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad;


    //constructores > permiten construir el objeto
    //si no se agrega un constructor se crea por defecto uno y este NO asigna valores a los atributos
    //creamos un constructor, debera de tener el mismo nombre de la clase, podemos pasarle argumentos entre paarentesis o no
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){} {
       // asignamos valores a los atributos
        //estos valores que recibe el constructor vienen desde afuera de la clas y  que se le pasan por parametro
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }



    //comportamiento > diferentos metodo que simbolizan  el comportamiento de un coche ejemplo acelerar, frenar, desacelear
    //creamos un metodo, que nos permite realizar el comportamiento de un coche.
    public void acelerar(Integer cantidad) {
        if ((cantidad > 0) && (cantidad<=120)) {
            this.velocidad += cantidad;
        }
    }

    @Override
    //este metodo nos devuelve de los atributos de un coche, funciona cuando creamos ibjetos
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
