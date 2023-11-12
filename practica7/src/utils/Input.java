package utils;

import java.util.Scanner;

public class Input {

    public static String obtenerInput(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        return scanner.hasNextLine() ? scanner.nextLine() : "";
    }
}
