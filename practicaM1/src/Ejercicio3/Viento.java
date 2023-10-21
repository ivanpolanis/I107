package Ejercicio3;

public class Viento extends Instrumento{

    public Viento(){
        this.instrumento = TipoInstrumento.VIENTO;
    }

    public void tocar() {
        System.out.println("Soy un instrumento de viento y me toco en " + this.afinacion.name());
    }
}
