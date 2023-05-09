package poo.clases;

import java.util.Vector;

//esta seria la super clase
public class Vehiculo {
    //estructora de una clase
    //1. atributos
    protected String fabric;
    protected String model;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;


    //2. construct se usa para crear los objetos
    //podemos tener sobre carga de constructores, el mismo nombre pero cada uno pedira atributos diferentes.
    public Vehiculo(){

    }

    public Vehiculo(String fabric, String model, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabric = fabric;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabric, String model){
        //parametro este es el atributo que esta declarado afuera = atributos son los que tiene cl consyructot o la funcion
        this.fabric=fabric;
        this.model=model;

    }
    //podemos crear metodo con clic derecho y sleccionamos construcor y seleccionamos los atributos que deseamos como ejemplo

    public Vehiculo(String fabric, int year) {
        this.fabric = fabric;
        this.year = year;
    }


    //3. metho (comportamiento)
    //aqui jugamos con los valores de los atributos

    //este metodo tomara el atributo speed y le modificara su valor mediante el atributo quantity del metodo acelerar
    public void acelerar( int quantity){
        this.speed += quantity;
    }

    //getter y setter

    //toString


}
