import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenWindow implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("add new window");

    //this be a constructor method
    public OpenWindow(){
        button.setBounds(50, 75, 50, 50);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 150);
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
