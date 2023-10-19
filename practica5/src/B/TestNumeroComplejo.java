package B;

import B.unlp.info.math.Complex;

import java.util.Scanner;

public class TestNumeroComplejo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese la parte real del primer numero complejo");
            double re = scanner.nextDouble();
            System.out.println("Ingrese la parte imaginaria del primer numero complejo");
            double im = scanner.nextDouble();
            Complex c1 = new Complex(re, im);
            System.out.println("Ingrese la parte real del segundo numero complejo");
            re = scanner.nextDouble();
            System.out.println("Ingrese la parte imaginaria del segundo numero complejo");
            im = scanner.nextDouble();
            Complex c2 = new Complex(re, im);
            System.out.println("La suma de los numeros complejos es: " + c1.add(c2));
            System.out.println("La resta de los numeros complejos es: " + c1.substract(c2));
        }
    }
}
