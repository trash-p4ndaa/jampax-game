import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenWindow implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("test");

    public OpenWindow(){
        button.setBounds(300, 300, 500, 500);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            new NewWindow();
        }
    }
}
