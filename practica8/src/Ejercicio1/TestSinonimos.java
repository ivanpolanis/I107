package Ejercicio1;

public class TestSinonimos {
    public static void main(String[] args){
        DiccionarioDeSinonimos dic = new DiccionarioDeSinonimos();
        dic.getSinonimos("sillono");
        dic.getClaves();
        dic.printDic();
    }
}
