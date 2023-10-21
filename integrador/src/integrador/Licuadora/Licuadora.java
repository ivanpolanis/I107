package integrador.Licuadora;

import integrador.DispositivoElectrico;
import integrador.EstadoDispositivo;

import java.util.Scanner;

public class Licuadora extends DispositivoElectrico {

    private double capacidadVaso;
    private int velocidades;
    private final int capacidadMax = 2;
    public Licuadora(EstadoDispositivo estado, boolean conexion, double capacidadVaso, int velocidades){
        super(estado,conexion);
       this.capacidadVaso = capacidadVaso;
       this.velocidades = velocidades;
    }

    public Licuado licuar(String f1, String f2){
        if(!this.conexion || this.estado == EstadoDispositivo.APAGADO) {
            System.out.println("El dispositivo no se encuentra prendido");
            return null;
        }


        System.out.println("¿Desea que su licuado tenga azucar?(y/N)");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        boolean azucar = res.equalsIgnoreCase("y");

        System.out.println("¿Desea su licuado con agua o con leche?(A/l)");
        res = scanner.nextLine();
        boolean leche = res.equalsIgnoreCase("l");

        return new Licuado(f1,f2,azucar,leche);
    }
}
