package Units.utils;

import java.util.Arrays;

public class ArrayUtils{
    public static boolean contains(String[] arr, String param) {
       for(String elem : arr){
           if(elem.equals(param)) return true;
       }
       return false;
    }
}
