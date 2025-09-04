package salario;

import java.util.Scanner;

public class Salario {

    public void calcularSalario() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas: ");
        int horas = scan.nextInt();

        System.out.print("Informe o valor da hora: ");
        double valorHora = scan.nextDouble();

        int horasExtras = 0;

        if (horas > 40) {
            horasExtras = horas - 40;
            horas = 40;
        }

        double salario = horas * valorHora + horasExtras * (valorHora * 1.5);
        System.out.printf("Valor do salário: R$ %.2f %n", salario);
    }

    public void calcularSalarios(int vezes) {
        int cont = 0;

        while (cont < vezes) {
            calcularSalario();

            cont++;
        }
    }
}
