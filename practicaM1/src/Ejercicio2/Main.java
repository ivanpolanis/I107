package Ejercicio2;

public class Main {
    public static void main(String[] args){
        Equipo equipo = new Equipo(new Jugador[]{
            new Jugador(new Posicion[]{Posicion.ARQUERO, Posicion.DEFENSA}),
            new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.MEDIOCAMPO}),
            new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.MEDIOCAMPO}),
            new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.MEDIOCAMPO}),
            new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.MEDIOCAMPO}),
            new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.MEDIOCAMPO}),});

        Equipo equipo2 = new Equipo(new Jugador[]{
            new Jugador(new Posicion[]{Posicion.ARQUERO, Posicion.DEFENSA}),
            new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.MEDIOCAMPO}),
            new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.MEDIOCAMPO}),
            new Jugador(new Posicion[]{Posicion.DELANTERO, Posicion.MEDIOCAMPO}),
            new Jugador(new Posicion[]{Posicion.DELANTERO, Posicion.MEDIOCAMPO}),});
        System.out.println(equipo.verificarEquipo());
        System.out.println(equipo2.verificarEquipo());
    }
}
