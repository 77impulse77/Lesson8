import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow(){
        setVisible(true);
        setLocation(500, 250);
        setSize(400,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton btn1 = new JButton("Вход");
        panel.add(btn1);



        JButton btn2 = new JButton("Выход");
        panel.add(btn2);

        ActionListener listener = new CloseActionListener();

        btn2.addActionListener(listener);

        add(panel, BorderLayout.SOUTH);
    }
}
