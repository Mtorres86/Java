package poo;

public class SmartDevice {
    //atributos
    protected  String color;
    protected String tamaño;
    protected String disponible;

    //constructores
    public void SmartDevice(){}

    public void SmartDevice(String color, String tamaño){
        this.color = color;
        this.tamaño = tamaño;
    }

        //metodo comportamiento
        public void estado(String disp){
            this.disponible =disp;

        }



}
