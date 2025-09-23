package animais;

public class Peixe extends Animal {

    public void mover() {
        setX(getX() + 5);
        setY(getY() + 5);
        System.out.println("glup glup");
    }

    public String toString() {
        return "Peixe: (" + getX() + ", " + getY() + ")";
    }

}
