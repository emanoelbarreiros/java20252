package interfaces;

import javax.swing.*;

public class TesteBotaoListenerForm {

    public static void main(String[] args) {
        BotaoListenerForm form = new BotaoListenerForm();

        JFrame frame = new JFrame();
        frame.setContentPane(form.getPanel1());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
