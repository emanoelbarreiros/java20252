package pessoa;

import java.util.ArrayList;
import java.util.Collections;

public class TesteComparable {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Jair"));
        pessoas.add(new Pessoa("Robson"));
        pessoas.add(new Pessoa("Romao"));
        pessoas.add(new Pessoa("Amelia"));

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        System.out.println();

        Collections.sort(pessoas, new ComparadorPessoa());

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
