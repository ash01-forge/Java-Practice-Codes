package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toggle implements ActionListener {





    JFrame frame;
    JPanel panel;
    JButton button;

    public Toggle() {
       frame=new JFrame();
       frame.setSize(200,250);
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
       frame.setLayout(new FlowLayout());
       panel=new JPanel();
       button=new JButton("click me");
       frame.add(panel);
       panel.add(button);
       frame.setVisible(true);
       button.addActionListener(this);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
        if (button.getText().equals("click me")) button.setText("Clicked");
        else button.setText("click me");

        }


public static void main(String[] args) {
    new Toggle();
}

}
