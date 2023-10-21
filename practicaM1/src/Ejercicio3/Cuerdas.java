package Ejercicio3;

public class Cuerdas extends Instrumento{

    public Cuerdas(){
        this.instrumento = TipoInstrumento.CUERDAS;
    };

    public void tocar(){
        System.out.println("Soy un instrumento de cuerda y me toco en " + this.afinacion.name()  );
    }

}
