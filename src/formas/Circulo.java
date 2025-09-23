package formas;

public class Circulo extends Forma {

    private float raio;

    public double area() {
        return Math.PI * raio * raio;
    }
}
