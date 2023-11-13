package Ejercicio1;

import java.util.*;

public class DiccionarioDeSinonimos {
    Map<String, LinkedList<String>> diccionario;

    public DiccionarioDeSinonimos() {
        this.diccionario = new HashMap<>();
        diccionario.put("sillon", new LinkedList<String>(Arrays.asList("asiento","butaca","silla")));
        diccionario.put("casa", new LinkedList<String>(Arrays.asList("edificacion","inmueble","hogar","obra")));
        diccionario.put("libro", new LinkedList<String>(Arrays.asList("ejemplar","manual","texto","obra")));
        diccionario.put("computador", new LinkedList<String>(Arrays.asList("equipo","ordenador","pc")));
    }

    public void getSinonimos(String key){
        LinkedList<String> sinonimos = diccionario.get(key);

        if (sinonimos == null) {
            System.out.println("El valor no se encuentra en el diccionario");
            return;
        }

        for(String sin: sinonimos){
            System.out.println(sin);
        }
    }

    public void getClaves(){
        System.out.println(diccionario.keySet());
    }

    public void printDic(){
        for(String key: diccionario.keySet()){
            System.out.print(key+":");
            for(String val: diccionario.get(key)){
                System.out.print(" " + val);
            }
            System.out.println();
        }
    }
}
