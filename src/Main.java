import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {
    public Main(){
        addKeyListener(this);
    }
    @Override
    public void paintComponent(Graphics g){
        requestFocusInWindow();
    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(500,500);
        window.setContentPane(new Main());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key typed: "+e.getKeyChar());
    }


    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key Pressed: "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("key Released: "+e.getKeyChar());
    }
}