package animais;

public class Sapo extends Animal{

    public void mover(){
        setX(getX() + 1);
        System.out.println("rebit");
    }

    public String toString() {
        return "Sapo: (" + getX() + ", " + getY() + ")";
    }
}
