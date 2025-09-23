package formas;

public class Triangulo extends Forma {

    private float base;
    private float altura;

    public double area() {
        return base * altura / 2;
    }
}
