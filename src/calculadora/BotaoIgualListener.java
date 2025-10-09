package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoIgualListener implements ActionListener {

    private ControladorCalculadora controlador;

    public BotaoIgualListener(ControladorCalculadora controlador) {
        this.controlador = controlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controlador.igualClicado();
    }
}
