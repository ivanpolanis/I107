import Units.Magnitude;

public class SpaceProbe<T extends Magnitude> {
   public void print(T unit) {
       System.out.println(unit.getValue() + " " + unit.getUnit());
   }

}
