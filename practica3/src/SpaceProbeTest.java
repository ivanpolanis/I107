import Units.Length;
import Units.Magnitude;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

public class SpaceProbeTest{
    @Test
    @DisplayName("Test super test")
    public void test() {
        LinkedList<Length> lengths = new LinkedList<>();
        SpaceProbe<Length> internationalProbe = new SpaceProbe<>();
        lengths.add(new Length(22.56,"ft"));
        lengths.add(new Length(0.33,"y"));
        lengths.add(new Length(15.32,"y"));
        lengths.add(new Length(32.6,"ft"));
        lengths.add(new Length(10.4,"'"));

        for (Length len : lengths) {
            len.toInternational();
            internationalProbe.print(len);
        }

        }
    }