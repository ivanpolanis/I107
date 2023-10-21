package integrador;

import integrador.EstadoDispositivo;

public abstract class DispositivoElectrico {
    protected EstadoDispositivo estado;
    protected boolean conexion;

    protected DispositivoElectrico(EstadoDispositivo estado, boolean conexion){
        this.estado = estado;
        this.conexion = conexion;
    }

    public EstadoDispositivo getEstado() {
        return estado;
    }
   public boolean isConnected() {
       return conexion;
   }
}
