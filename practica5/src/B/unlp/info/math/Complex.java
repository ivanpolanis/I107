package B.unlp.info.math;

import java.util.Objects;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex add(Complex c) {
        this.re += c.realPart();
        this.im += c.imaginaryPart();
        return this;
    }

    public Complex substract(Complex c) {
        this.re -= c.realPart();
        this.im -= c.imaginaryPart();
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(re, complex.re) == 0 && Double.compare(im, complex.im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    @Override
    public String toString() {
        return "z=" +
                " " + re +
                " " + im +
                "i";
    }
}
