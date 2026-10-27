package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("My GUI App");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JTextField tx1= new JTextField("0",10);
        JButton increment=new JButton("Increment");

        ActionListener l1=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val=tx1.getText();
                int ival=Integer.parseInt(val);
                ival++;
                tx1.setText(ival+"");

            }
        };
        increment.addActionListener(l1);
        frame.add(tx1);
        frame.add(increment);
//        JPanel panel=new JPanel();
//        JPanel panel1=new JPanel();
//        JPanel panel2=new JPanel();
//        JButton button=new JButton("Button1");
//        JButton button2=new JButton("Button2");
//        JButton button3=new JButton("Button3");
//        JLabel label1=new JLabel("Label 1");
//        JTextField tx1=new JTextField(10);
//        button2.setBackground(new Color(35, 101, 57));
//        panel.setBackground(Color.GRAY);
//        panel1.add(label1);
//        panel1.add(tx1);
//        panel2.add(button);
//        panel2.add(button2);
//        panel.add(panel1);
//        panel.add(panel2);
//        frame.add(panel);
        frame.setVisible(true);
    }
}
