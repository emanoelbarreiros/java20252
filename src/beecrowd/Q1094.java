package beecrowd;

import java.util.Scanner;

public class Q1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdCobaias = 0;
        String tipoCobaia = "";
        int qtdCoelhos = 0;
        int qtdSapos = 0;
        int qtdRatos = 0;

        int n = scan.nextInt();
        int contador = 0;
        while (contador < n) {
            qtdCobaias = scan.nextInt();
            tipoCobaia = scan.nextLine().trim();

            switch (tipoCobaia) {
                case "C":
                    qtdCoelhos += qtdCobaias;
                    break;
                case "R":
                    qtdRatos += qtdCobaias;
                    break;
                case "S":
                    qtdSapos += qtdCobaias;
                    break;
            }

            contador++;
        }

        int totalCobaias = qtdSapos + qtdCoelhos + qtdRatos;
        System.out.printf("Total: %d cobaias%n", totalCobaias);
        System.out.printf("Total de coelhos: %d%n", qtdCoelhos);
        System.out.printf("Total de ratos: %d%n", qtdRatos);
        System.out.printf("Total de sapos: %d%n", qtdSapos);
        System.out.printf("Percentual de coelhos: %.2f%%%n", percentual(qtdCoelhos, totalCobaias));
        System.out.printf("Percentual de ratos: %.2f%%%n", percentual(qtdRatos, totalCobaias));
        System.out.printf("Percentual de sapos: %.2f%%%n", percentual(qtdSapos, totalCobaias));
    }

    public static double percentual(double parte, double todo) {
        return parte / todo * 100;
    }
}
