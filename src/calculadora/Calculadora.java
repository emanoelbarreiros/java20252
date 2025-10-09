package calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField textField1;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton divButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton multButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton subButton;
    private JButton a0Button;
    private JButton pontoButton;
    private JButton igualButton;
    private JButton somaButton;
    private JPanel painelPrincipal;
    private ControladorCalculadora controlador;

    public Calculadora() {
        controlador = new ControladorCalculadora(this);

        a7Button.addActionListener(new BotaoNumeroListener(7, controlador));
        a8Button.addActionListener(new BotaoNumeroListener(8, controlador));
        a9Button.addActionListener(new BotaoNumeroListener(9, controlador));
        a6Button.addActionListener(new BotaoNumeroListener(6, controlador));
        a5Button.addActionListener(new BotaoNumeroListener(5, controlador));
        a4Button.addActionListener(new BotaoNumeroListener(4, controlador));
        a3Button.addActionListener(new BotaoNumeroListener(3, controlador));
        a2Button.addActionListener(new BotaoNumeroListener(2, controlador));
        a1Button.addActionListener(new BotaoNumeroListener(1, controlador));
        a0Button.addActionListener(new BotaoNumeroListener(0, controlador));

        divButton.addActionListener(new BotaoOperacaoListener("/", controlador));
        multButton.addActionListener(new BotaoOperacaoListener("X", controlador));
        subButton.addActionListener(new BotaoOperacaoListener("-", controlador));
        somaButton.addActionListener(new BotaoOperacaoListener("+", controlador));

        igualButton.addActionListener(new BotaoIgualListener(controlador));
    }

    public JPanel getPainelPrincipal() {
        return painelPrincipal;
    }

    public void atualizarVisor(int numero) {
        textField1.setText(String.valueOf(numero));
    }
}
