package herencia;

import poo.SmartDevice;

public class SmartPhone extends SmartDevice {
    //atributos
    String marca;
    int precio;
    String detalles;



    //constrctores
    public SmartPhone() {}

    public SmartPhone(String marca, int precio, String detalles) {
        this.marca = marca;
        this.precio = precio;
        this.detalles = detalles;
    }



}
