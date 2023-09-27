package Units;

import static Units.utils.ArrayUtils.contains;

public class Length extends Magnitude{

    public Length(double value, String unit) {
        String[] international = new String[]{"km", "m", "cm", "mm"};
        if (contains(international, unit)) {
            sys = MetricSystem.INTERNATIONAL;
            this.unit = "m";
        } else {
            sys = MetricSystem.ENGLISH;
            this.unit = "ft";
        }
        this.value = normalize(value, unit);
    }

    private double normalize(double value, String unit) {
        if (sys == MetricSystem.INTERNATIONAL) {
            if (unit.equals("km")) return value*1000;
            if (unit.equals("cm")) return value/100;
            if (unit.equals("mm")) return value/1000;
        }
        else {
            if (unit.equals("'")) return (value/12);
            if (unit.equals("y")) return (value*3);
        }
        return value;
    }


    public Length() {
        this.value = 0;
        this.unit = "m";
    }

    public double toEnglish(){
        // 1m = 3,28084ft
        if(sys==MetricSystem.ENGLISH)
            return value;
        this.value*=3.28084;
        this.unit="ft";
        this.sys=MetricSystem.ENGLISH;
        return this.value;
    }

    public double toInternational(){
        // 1ft=0,3048m
        if (sys==MetricSystem.INTERNATIONAL)
            return value;
        this.value*=0.3048;
        this.unit="m";
        this.sys=MetricSystem.INTERNATIONAL;
        return this.value;
    }
}
