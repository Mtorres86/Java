package com.herencia;

public class Coche {
    //atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //constructres su sintaxis es especial es con mayuscula y recibe el mismo nombre de la clase
    // los contsuctires reciben parametros desde fuera de la clases y la queremos asiganar dentro de la clase
    //los parametros que recibimos se asignan a los objetos que estan dentro del contsructor
    public Coche(String color, String fabricante, String modelo, Double peso, Double larho ) {
        //los constructores se crean atributos internos se interpone la palabra reservada this y se igualan al parametro que viene de afuera de la cases
        // esto hara que el objeto interno de la clases tome el valor que tiene el parametro externo
        this.color = color; //aqui creamos el obajeto y le sginamos la propiedad color que esta fuera de la clase
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    //comportamiento, es un metodo que hara que la clase se ejecute
    //en este ejemplo haremos que la clase Coche acelere y desacelete
    public void acelerar(Integer cantidad) {
        //creamos una seguridad para que el valor sea diferente de 0 y menor a 120
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
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
