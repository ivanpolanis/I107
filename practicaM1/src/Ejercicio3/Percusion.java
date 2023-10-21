package Ejercicio3;

public class Percusion extends Instrumento{

    public Percusion(){
        this.instrumento = TipoInstrumento.PERCUSION;
    }


    public void tocar() {
        System.out.println("Soy un instrumento de percusion y me toco en " + this.afinacion.name());
    }
}
