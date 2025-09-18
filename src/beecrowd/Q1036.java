package beecrowd;

import java.util.Scanner;

public class Q1036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double delta = b*b - 4*a*c;
        double x = 10.0;

        if (delta >= 0 && a != 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
