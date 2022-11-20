import javax.swing.*;
import java.awt.*;

public class MyPane extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        System.out.println("Java is invoking~");
        g.setColor(Color.RED);
        g.fillRect(0,0,getWidth(),getHeight());

    }
}
