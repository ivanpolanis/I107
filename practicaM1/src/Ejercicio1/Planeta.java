package Ejercicio1;

public class Planeta {
    private int lunas;
    private Tipo tipo;
    private double diametro;
    private double distanciaAlSol;

    public Planeta(int lunas, Tipo tipo, double diametro, double distanciaAlSol) {
        this.lunas = lunas;
        this.tipo = tipo;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
    }

    public int getLunas() {
        return lunas;
    }

    public void setLunas(int lunas) {
        this.lunas = lunas;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(float distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }
}
