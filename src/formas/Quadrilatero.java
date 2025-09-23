package formas;

public abstract class Quadrilatero extends Forma {

    private float largura;
    private float altura;

//    public double area() {
//        return largura * altura;
//    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
