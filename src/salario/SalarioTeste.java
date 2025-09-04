package salario;

import java.util.Scanner;

public class SalarioTeste {

    public static void main(String[] args) {
        Salario salario = new Salario();
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;
        int opcao = 0;

        while(continuar) {
            salario.calcularSalarios(3);

            System.out.println("Você deseja continuar calculando? ");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");

            opcao = scan.nextInt();

            if (opcao == 2) {
                break;
            }
        }
    }
}
