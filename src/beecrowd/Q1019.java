package beecrowd;

import java.util.Scanner;

public class Q1019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int segundosTotal = scan.nextInt();

        int minutosTotal = segundosTotal / 60;
        int segundos = segundosTotal % 60;

        int horas = minutosTotal / 60;
        int minutos = minutosTotal % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
    }
}
