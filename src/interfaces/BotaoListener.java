package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoListener implements ActionListener {

    private int numeroListener;

    public BotaoListener(int numero) {
        this.numeroListener = numero;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("O botão foi clicado, evento tratado pelo listener " + numeroListener);
    }
}
