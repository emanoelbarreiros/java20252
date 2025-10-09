package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoOperacaoListener implements ActionListener {

    private String operacao;
    private ControladorCalculadora controlador;

    public BotaoOperacaoListener(String operacao, ControladorCalculadora controlador) {
        this.operacao = operacao;
        this.controlador = controlador;
    }

    public void actionPerformed(ActionEvent e) {
        controlador.operacaoClicada(operacao);
    }

}
