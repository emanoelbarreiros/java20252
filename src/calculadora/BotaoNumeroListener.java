package calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoNumeroListener implements ActionListener {

    private int numero;
    private ControladorCalculadora controlador;

    public BotaoNumeroListener(int numero, ControladorCalculadora controlador) {
        this.numero = numero;
        this.controlador = controlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controlador.numeroClicado(numero);
    }
}
