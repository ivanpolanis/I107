import integrador.*;
import integrador.Licuadora.Licuado;
import integrador.Licuadora.Licuadora;

public class Test {
    public static void main(String[] args){
        Licuadora licuadora = new Licuadora(EstadoDispositivo.PRENDIDO, true, 50, 5);
        Licuado licuado = licuadora.licuar("Frutilla","Banana");
        System.out.println(licuado.toString());

        Heladera heladera = Heladera.getInstance();
        Alimento[] alimentos = {new Alimento("Frutilla", EstadoAlimento.BIEN), new Alimento("Banana", EstadoAlimento.BIEN)};
        for(Alimento al: alimentos){
            heladera.agregarAlimento(al);
        }
        heladera.mostrarContenido();
        heladera.desenchufar();
        heladera.mostrarContenido();

        Reproductor reproductor = new Reproductor(EstadoDispositivo.PRENDIDO, true, new String[]{"Cancion1", "Cancion2", "Cancion3"});
        reproductor.reproducirCD();
        reproductor.ReproducirCancion();
    }
}
