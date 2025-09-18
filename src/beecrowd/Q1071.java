package beecrowd;

import java.util.Scanner;

public class Q1071 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int a = 0;
        int b = 0;

        if (n1 <= n2) {
            a = n1;
            b = n2;
        } else {
            a = n2;
            b = n1;
        }

        int soma = 0;
        int contador = a + 1;
        while (contador < b) {
            if (contador % 2 != 0) {
                soma += contador;
            }

            contador++;
        }
        System.out.println(soma);
    }
}
