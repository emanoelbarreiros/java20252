package formas;

public class Trapezio extends Quadrilatero {
    private float baseMenor;

    public double area() {
        return ((getLargura() + baseMenor) * getAltura()) / 2;
    }
}
