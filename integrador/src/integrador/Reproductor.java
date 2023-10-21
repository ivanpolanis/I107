package integrador;

public class Reproductor  extends DispositivoElectrico {
   private String[] CD = new String[5];
   private int cancionActual;

   public Reproductor(EstadoDispositivo estado, boolean conexion, String[] CD) {
      super(estado, conexion);
      this.CD = CD;
      this.cancionActual = 0;
   }

  public void ReproducirCancion() {
      if (cancionActual >= CD.length) cancionActual = 0;
     System.out.println(CD[cancionActual]);
     cancionActual++;
  }

  public void reproducirCD(){
      for(String cancion: CD){
         System.out.println(cancion.toString());
      }
      cancionActual=0;
  }

  public void cambiarCD(String[] CD){
      this.CD = CD;
      cancionActual = 0;
  }

}