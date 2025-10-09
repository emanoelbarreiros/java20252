package calculadora;

public class ControladorCalculadora {

    private Calculadora calc;
    private int operando1;
    private int operando2;
    private String operacao;

    public ControladorCalculadora(Calculadora calc) {
        this.calc = calc;
        this.operando1 = 0;
        this.operando2 = 0;
    }

    public void numeroClicado(int numero) {
        if (this.operacao == null) {
            this.operando1 = this.operando1 * 10 + numero;
            calc.atualizarVisor(operando1);
        } else {
            this.operando2 = this.operando2 * 10 + numero;
            calc.atualizarVisor(operando2);
        }
    }

    public void operacaoClicada(String operacao) {
        this.operacao = operacao;
    }

    public void igualClicado() {
        if (operacao != null) {
            int resultado = 0;
            switch (operacao) {
                case "+":
                    resultado = operando1 + operando2;
                    break;
                case "-":
                    resultado = operando1 - operando2;
                    break;
                case "X":
                    resultado = operando1 * operando2;
                    break;
                case "/":
                    resultado = operando1 / operando2;
                    break;
            }
            calc.atualizarVisor(resultado);
        }
    }
}
