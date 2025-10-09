package interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoListenerForm {
    private JButton button1;
    private JPanel panel1;

    public JPanel getPanel1() {
        return panel1;
    }

    public BotaoListenerForm() {
        button1.addActionListener(new BotaoListener(1));
        button1.addActionListener(new BotaoListener(2));
    }
}
