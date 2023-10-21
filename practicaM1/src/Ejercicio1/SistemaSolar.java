package Ejercicio1;

public class SistemaSolar {
    private static SistemaSolar INSTANCE = new SistemaSolar();

    private Planeta[] planetas = {
        new Planeta(0, Tipo.ROCOSO, 4879, 57.9),
        new Planeta(0, Tipo.ROCOSO, 12104, 108.2),
        new Planeta(1, Tipo.ROCOSO, 12756, 149.6),
        new Planeta(2, Tipo.ROCOSO, 6792, 227.9),
        new Planeta(79, Tipo.GASEOSO, 142984, 778.6),
        new Planeta(82, Tipo.GASEOSO, 120536, 1433.5),
        new Planeta(27, Tipo.GASEOSO, 51118, 2872.5),
        new Planeta(14, Tipo.GASEOSO, 49528, 4495.1),
        new Planeta(5, Tipo.GASEOSO, 2370, 5906.4),
        new Planeta(27, Tipo.GASEOSO, 1188, 11809),};

    private SistemaSolar(){}

    public static SistemaSolar getInstance(){
        return INSTANCE;
    }
}
