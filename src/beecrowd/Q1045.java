package beecrowd;

import java.util.Scanner;

public class Q1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();

        double a = 0;
        double b = 0;
        double c = 0;

        if (n1 <= n2 && n2 <= n3) {//n1 < n2 < n3
            a = n3;
            b = n2;
            c = n1;
        } else if (n1 <= n3 && n3 <= n2) {//n1 < n3 < n2
            a = n2;
            b = n3;
            c = n1;
        } else if (n3 <= n1 && n1 <= n2) {// n3 < n1 < n2
            a = n2;
            b = n1;
            c = n3;
        } else if (n3 <= n2 && n2 <= n1) {// n3 < n2 < n1
            a = n1;
            b = n2;
            c = n3;
        } else if (n2 <= n1 && n1 <= n3) {// n2 < n1 < n3
            a = n3;
            b = n1;
            c = n2;
        } else if (n2 <= n3 && n3 <= n1) {// n2 < n3 < n1
            a = n1;
            b = n3;
            c = n2;
        }

        /*
        se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
        se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
        se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
        se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
        se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
        se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
         */
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a*a == b*b + c*c) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (a*a > b*b + c*c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (a*a < b*b + c*c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
