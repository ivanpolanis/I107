package Ejercicio1;

public class Telescopio {

    public static String distancia(Planeta planeta){
        return "La distancia al sol es: " + planeta.getDistanciaAlSol();
    }

    public static void tipo(Planeta planeta){
        switch (planeta.getTipo()){
            case ROCOSO -> System.out.println("El planeta es rocoso.");
            case GASEOSO -> System.out.println("El planea es gaseoso");
        }
    }
}
