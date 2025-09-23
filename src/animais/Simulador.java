package animais;

import formas.Forma;
import formas.Retangulo;

public class Simulador {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        Forma f = new Retangulo();

        animais[0] = new Peixe();
        animais[1] = new Sapo();
        animais[2] = new Animal();

        for (Animal animal : animais) {
            animal.mover();
        }

        for (Animal animal : animais) {
            System.out.println(animal.toString());
        }
    }
}
