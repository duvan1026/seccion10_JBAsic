package SwingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JPanel taxPanel;
    private JTextPane pricePane;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JLabel Precio;
    private JLabel IVA;
    private JLabel Total;
    private JButton buttonCalculate;


//    public ActionListener botonPulsado(){
//
//    }

    public MainForm(){

        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(pricePane.getText());
                double t = Double.parseDouble(taxPane.getText());

                double result = p + ( p/ 100 * t );
                totalPane.setText(Double.toString(result));

            }
        });


//        pricePane.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                super.keyTyped(e);
//                String valorPrecio = pricePane.getText() + "Ñ";
//                pricePane.setText(valorPrecio);
//
//            }
//        });
    }


    public static void main(String[] args){

        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);



    }

}
