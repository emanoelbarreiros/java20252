package excecoes;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExemploExcecoes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
//            System.out.println("Informe o primeiro numero: ");
//            int numero1 = scan.nextInt();
//
//            System.out.println("Informe o segundo numero: ");
//            int numero2 = scan.nextInt();
//            int divisao = 0;
//
//            divisao = numero1 / numero2;
//            System.out.println("Resultado da divisao: " + divisao);
            System.out.println("Será que dessa vez vai?");
            double valor = talvezLanceExcecao();
            System.out.println(valor);
        } catch(ArithmeticException e) {
            System.out.println("Não é possível realizar uma divisão por zero: " + e.getMessage());
        } catch(InputMismatchException e) {
            System.out.println("Informe apenas números inteiros válidos.");
        } catch(MinhaExcecao e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Desligando a luz e fechando a porta...");
        }

    }

    public static double talvezLanceExcecao() throws MinhaExcecao {
        Random rand  = new Random();
        double valor = rand.nextDouble();
        if (valor <= 0.5) {
            throw new MinhaExcecao("Que azar...");
        }
        return valor;
    }
}
