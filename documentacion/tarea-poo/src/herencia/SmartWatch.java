package herencia;

import poo.SmartDevice;

public class SmartWatch extends SmartDevice {

    String marca;
    int precio;
    String detalles;

    //constructor
    public SmartWatch(){}
    public SmartWatch(String marca, int precio, String detalles) {
        this.marca = marca;
        this.precio = precio;
        this.detalles = detalles;
    }
}
