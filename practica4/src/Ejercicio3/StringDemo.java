package Ejercicio3;

public class StringDemo {
    public static void main(String[] args) {
        String str1="Leones y Tigres y Osos!";
        String str2="Leones y Tigres y Osos!";
        String str3=str2;
        String str4=new String("Leones y Tigres y Osos!");
        String str5=" Y yo!";
        String str6="Leones y Tigres y Osos! Y yo!";
        String str7= str1 + str5;
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str2==str3);
        System.out.println(str2==str4);
        System.out.println(str3==str4);
        System.out.println(str6==str7);
        System.out.println(str1.equals(str4));
        System.out.println(str6.equals(str7));
    }
}