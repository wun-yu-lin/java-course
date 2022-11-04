import javax.swing.*;
import java.security.cert.TrustAnchor;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new MyPane());
        window.setVisible(true);
    }

    }