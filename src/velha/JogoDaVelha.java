package velha;

import java.util.Scanner;

public class JogoDaVelha {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int contador = 0;
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogada jogada = null;
        while(true) {

            if (contador % 2 == 0) {
                jogada = obterJogada("O");
            } else {
                jogada = obterJogada("X");
            }

            tabuleiro.realizarJogada(jogada);
            tabuleiro.exibirTabuleiro();

            contador++;
        }
    }

    public static Jogada obterJogada(String valor) {
        System.out.println("Vez do " + valor);
        System.out.print("Informe o valor da linha: ");
        int linha = scan.nextInt();
        System.out.print("Informe o valor da coluna: ");
        int coluna = scan.nextInt();

        return new Jogada(linha, coluna, valor);
    }
}
