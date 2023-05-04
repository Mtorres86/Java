package com.structcontrol;

public class bucleWhile {
    public static void main(String[] args) {
       int count = 0;
        while (count <10){
            //continue y brake
            count ++;
            if(count==5)
                continue;
            System.out.println("Hola"+"Valor de count"+ count);
            if(count==8)
                break;
        }
    }
}
