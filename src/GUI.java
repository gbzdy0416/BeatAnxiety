import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

public class GUI extends JFrame{
    JPanel begin, bsetting, bplay, mplay;
    JButton b,m,confirm1,cancel;
    JTextField sec,min;
    JLabel timecount1, timecount2;

    public GUI() {
        begin = new JPanel();
        begin.setLayout(new GridLayout(3, 1));
        b = new JButton("Try Deep Breathing");
        m = new JButton("Try Progressive Muscle Relaxation");
        begin.add(b);
        begin.add(m);
        begin.setSize(300,150);
    }
}
