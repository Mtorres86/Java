package herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

//esta seria subclase, o derivada etc..

public class Motocicleta extends Vehiculo {
    //atributos
    boolean baul;
    //dejamos un constructor vacios para poder crear nuestros propios en la clase super
    public Motocicleta(){}
    public Motocicleta(String fabric, String model, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabric, model, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
