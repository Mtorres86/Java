package com.structcontrol;

public class SwitchCase {
    public static void main(String[] args) {
        String weather = "cloudy";
        switch (weather){

            case "sunny":
                System.out.println("El tiempo es  soleado");
                //el break hace que se detenga el case cuando se cumpla y sale del proceso a l siguiente codigp
                break;
            case "cloudy":
                System.out.println("El tiempo es  nublado");
                break;
                //cuando un caso no se cumple ejecutamos un codigo, este no hace qye se rompa el proceso se continua.
            default:
                System.out.println("No existe el caso");


        }

    }



}
