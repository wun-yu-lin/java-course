import javax.swing.*;
import java.awt.*;

public class Java_gui extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        int width = getWidth();
        int height = getHeight();
        g.drawString("Hi, this is my first Java GUI", 10,10);
        g.drawLine(10,15,100,15);
        g.setColor(Color.BLACK);
        g.drawRect(0,0,width,height);
        g.drawString("Hi, this is my first Java GUI", 10,10);
    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,300);
        window.setContentPane(new Java_gui());
        window.setVisible(true);
    }
}
