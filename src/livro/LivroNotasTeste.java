package livro;

import java.util.Scanner;

public class LivroNotasTeste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomeCurso = scan.nextLine();
        LivroNotas livro = new LivroNotas(nomeCurso);


        nomeCurso = scan.nextLine();
        LivroNotas livro2 = new LivroNotas(nomeCurso);

        livro.exibirBoasVindas();
        livro2.exibirBoasVindas();
    }

}
