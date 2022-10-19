import javax.swing.*;
import java.awt.*;

public class Loop_lab extends JPanel {
    String type;
    int n;
    public Loop_lab(){
        type = JOptionPane.showInputDialog("Do you want an addition table or multiplication table? (A or M)");
        n = Integer.parseInt(JOptionPane.showInputDialog("How big you want?"));

    }
    @Override
    public void paintComponent(Graphics g){

        int width = getWidth();
        int height = getHeight();
        int x = 0;
        int y = 0;
        int cellwidth = width/n;
        int cellheight = height/n;
        for (int j=1; j<=n;j++){
            for (int i = 1; i<=n;i++){
                if (i==1||j==1) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(x, y, cellwidth, cellheight);
                }
                int temp = i+j;
                g.setColor(Color.BLACK);
                g.drawRect(x,y,cellwidth,cellheight);
                g.drawString(""+temp,x+5,y+15);
                x+=cellwidth;
            }
            x=0;
            y+=cellheight;
        }

    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(400,400);
        window.setVisible(true);
        window.setContentPane(new Loop_lab());
    }
}
