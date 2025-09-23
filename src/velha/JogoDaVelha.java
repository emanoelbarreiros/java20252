package velha;

import java.util.Scanner;

public class JogoDaVelha {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int contador = 0;
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogada jogada = null;
        String estado;
        while(true) {

            if (contador % 2 == 0) {
                jogada = obterJogada("O");
            } else {
                jogada = obterJogada("X");
            }

            if (tabuleiro.realizarJogada(jogada)) {
                tabuleiro.exibirTabuleiro();
                estado = tabuleiro.checaVencedor();
                if (estado.equals("X")) {
                    System.out.println("Vitória do jogador X.");
                    break;
                } else if (estado.equals("O")) {
                    System.out.println("Vitória do jogador O.");
                    break;
                } else if (estado.equals("empate")) {
                    System.out.println("O jogo empatou.");
                    break;
                } else if (estado.equals("aberto")) {
                    contador++;
                }

            } else {
                System.out.println("Jogada inválida. Tente novamente.");
                tabuleiro.exibirTabuleiro();
            }
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
