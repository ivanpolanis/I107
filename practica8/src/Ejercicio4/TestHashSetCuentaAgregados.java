package Ejercicio4;

import java.util.Arrays;

public class TestHashSetCuentaAgregados {
    public static void main(String[] args) {
        // Crear una instancia de HashSetCuentaAgregados
        HashSetCuentaAgregados<String> set = new HashSetCuentaAgregados<>();

        // Agregar elementos usando addAll
        set.addAll(Arrays.asList("Elemento1", "Elemento2", "Elemento3"));

        // Mostrar la cantidad de elementos agregados
        System.out.println("Cantidad de elementos agregados: " + set.getCantidadAgregados());
    }
}