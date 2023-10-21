package integrador.Licuadora;

public final class Licuado {
    private String f1;
    private String f2;
    private boolean azucar;
    private boolean leche;

    Licuado(String f1, String f2, boolean azucar, boolean leche){
        this.f1 = f1;
        this.f2 = f2;
        this.azucar = azucar;
        this.leche = leche;
    }

    @Override
    public String toString(){
        String azucar = this.azucar ? " con azucar " : " sin azucar ";
        String leche = this.leche ? " de leche." : " de agua.";
        return "Licuado de " + f1 + " y " + f2 + azucar + leche;
    }
}
