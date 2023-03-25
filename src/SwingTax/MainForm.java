package SwingTax;

import javax.swing.*;

public class MainForm {
    private JPanel taxPanel;
    private JTextPane pricePane;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JLabel Precio;
    private JLabel IVA;
    private JLabel Total;
    private JButton buttonCalculate;


    public static void main(String[] args){

        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);



    }

}
