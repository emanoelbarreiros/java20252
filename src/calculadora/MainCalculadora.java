package calculadora;

import javax.swing.*;

public class MainCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        JFrame frame = new JFrame("JCalc");
        frame.setContentPane(calc.getPainelPrincipal());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
