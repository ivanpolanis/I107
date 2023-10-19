package A.Ejercicio2;
import java.util.Random;

public final class GeneraRandom {

    private final static int MAX_VALUE = 10;
    private final static Random random = new Random(System.currentTimeMillis());

    private GeneraRandom() {
    }
    public static int getRandomInt() {
        return random.nextInt(0,MAX_VALUE);
    }
}
