package animais;

public class Animal {

    private float x;
    private float y;

    public void mover() {
        x += 10;
        y += 10;
        System.out.println("O animal se moveu.");
    }

    public String toString() {
        return "Animal: (" + x + ", " + y + ")";
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
