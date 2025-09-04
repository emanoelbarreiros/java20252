package livro;

import java.util.Scanner;

public class LivroNotas {

    private String nomeCurso;

    public LivroNotas(String nome) {
        nomeCurso = nome;
    }

    public LivroNotas() {

    }

    public void setNomeCurso(String nome) {
        nomeCurso = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void exibirBoasVindas() {
        System.out.println("Bem-vindo ao livro de notas do curso " + nomeCurso + "!" + nomeCurso.length());
    }

    public void determinarMediaTurma() {
        int contador = 0;
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        double nota = 0;
        int menoresSete = 0;

        while(contador < 10) {
            System.out.print("Informe a nota " + (contador + 1) + ": ");
            nota = scan.nextDouble();

            soma = soma + nota;

            if (nota < 7) {
                menoresSete = menoresSete + 1;
            }

            contador = contador + 1;
        }

        double media = soma / 10;
        System.out.println("A média da turma é " + media);
        System.out.printf("%d alunos tiraram nota inferior a 7,0.", menoresSete);
    }

}
