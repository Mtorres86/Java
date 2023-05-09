package poo.clases;

public class Motor {
    //atribuutos
    String modelomotor;
    int caballos;
    double parNm;
    int numCilindros;

    //constructores
    //se deja una vacio por si deseamos agregar nuevos atributos
    public Motor(){}

    public Motor(String modelomotor, int caballos, double parNm, int numCilindros) {
        this.modelomotor = modelomotor;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }

    //metodos
}
