package com.herencia;

public class Coche {
    //atributos
    String marca;
    String modelo;
    String color;
    Integer velocidad=0;

    //metodos
    public Coche(String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;

    }

    public Coche() {
    }
//metodo de la clase Coche
    public void acelerar(Integer cantidad){
        if(cantidad>0 && cantidad<=100) {
            this.velocidad += cantidad;
        }

    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
