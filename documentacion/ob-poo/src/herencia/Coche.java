package herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

//herenciac vienen bien para aquellos objetos que comparten valores estandar pero necesitan detalles especificos de la clase
//en este ejemplo tenemos una clase que se llama vehiculo y esta tiene atrubutos estandar
//al crear una clase nueva heredamos los atributos y le asignamos los nuevos

//con la herencia no se pueden heredar mas de una clase
public class Coche extends Vehiculo {
    //atributos
    int  numPuertas;
    public Coche(){}
    public Coche(String fabric, String model, double cc, int year, boolean sport, int speed, Motor motor, int numPuertas) {
        super(fabric, model, cc, year, sport, speed, motor);
        this.numPuertas = numPuertas;
    }
}
