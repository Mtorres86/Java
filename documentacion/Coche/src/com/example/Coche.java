package com.example;

public class Coche {
    //atributos
    String color;
    String modelo;
    String marca;
    Integer velocidad=0;

    //constructor
    public Coche() {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;

    }
    public void acelerar(Integer cantidad){
        if ((cantidad>0)&&(cantidad<=120)){
            this.velocidad+=cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
