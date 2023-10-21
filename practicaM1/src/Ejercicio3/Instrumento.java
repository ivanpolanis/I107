package Ejercicio3;

public abstract class Instrumento {
    protected TipoAfinacion afinacion;

    protected TipoInstrumento instrumento;

    public Instrumento(){
        this.afinacion = TipoAfinacion.DO;
    }
    public abstract void tocar();

    public void setAfinacion(TipoAfinacion afinacion) {
        this.afinacion = afinacion;
    }

    public TipoAfinacion getAfinacion() {
        return afinacion;
    }

    public TipoInstrumento getInstrumento() {
        return instrumento;
    }
}
