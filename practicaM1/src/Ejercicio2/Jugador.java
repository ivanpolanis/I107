package Ejercicio2;

public class Jugador {
    private Posicion[] pos;

    public Jugador(Posicion[] pos){
        this.pos = pos;
    }

    public Posicion[] getPos() {
        return pos;
    }

    public void setPos(Posicion[] pos) {
        this.pos = pos;
    }
}
