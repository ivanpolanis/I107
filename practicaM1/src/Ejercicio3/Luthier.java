package Ejercicio3;

public class Luthier {
    public static void afinar(Instrumento instrumento){
        switch (instrumento.getInstrumento()){
            case CUERDAS -> instrumento.setAfinacion(TipoAfinacion.DO);
            case VIENTO -> instrumento.setAfinacion(TipoAfinacion.SI);
            case PERCUSION -> instrumento.setAfinacion(TipoAfinacion.RE);
        }
    }
}
