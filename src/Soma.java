import  java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        double soma;

        System.out.print("Informe o primeiro número: ");
        num1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        num2 = scan.nextInt();

        soma = num1 + num2;

        System.out.printf("O valor da soma é %.2f.", soma);

        scan.close();
    }
}