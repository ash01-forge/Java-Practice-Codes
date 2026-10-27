package GuiPerform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Perform implements ActionListener {
    JFrame frame;
    JButton button;
    JTextField tx1;
    JLabel label;
//    String num="10";



    public Perform() {
        frame= new JFrame("GUI Application");
        frame.setSize(250,300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("10");
        button=new JButton("Perform");
         tx1=new JTextField("+5",10);
        JPanel panel=new JPanel();
        frame.add(panel);
        panel.add(label);
        panel.add(tx1);
        panel.add(button);
        panel.setLayout(new GridLayout(3,1));
        button.addActionListener(this);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String value= String.valueOf(Integer.parseInt(label.getText()));
        int newV=Integer.parseInt(value);
         newV = newV + 5;
        label.setText(String.valueOf(newV));

    }


    public static void main(String[] args) {
        new Perform();

    }
}
