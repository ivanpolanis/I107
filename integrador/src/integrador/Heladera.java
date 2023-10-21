package integrador;

public class Heladera extends DispositivoElectrico{
    private static Heladera INSTANCE = new Heladera();
    private Alimento[] alimentos = new Alimento[20];
    private int cont = 0;


    private Heladera(){
        super(EstadoDispositivo.PRENDIDO, true);
    }
   public static Heladera getInstance() {
       return INSTANCE;
   }

   public boolean agregarAlimento(Alimento alimento){
        if (cont >= alimentos.length) return false;

        alimentos[cont] = alimento;
        cont++;
        return true;
   }

   public void verificarConexion(){
        if (!this.conexion || this.estado == EstadoDispositivo.APAGADO) {
            for(int i = 0; i < cont; i++){
                alimentos[i].pudrirAlimento();
            }
            System.out.println("La heladera esta sin conexion o se encuentra apagada. Los alimentos se prudieron.");
        }
        else {
       System.out.println("Esta todo joya.");
        }
   }

   public void desenchufar(){
       this.conexion = false;
   }
   public void mostrarContenido(){
        verificarConexion();
       System.out.println("El contenido de la heladera es:");
        for(int i = 0; i < cont; i++){

            System.out.println(alimentos[i].toString());
        }
   }
}
