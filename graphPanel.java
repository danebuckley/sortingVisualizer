import javax.swing.*;
import java.awt.*;

public class graphPanel extends JPanel {

    graphPanel() {
        this.setPreferredSize(new Dimension(400,500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0,400,0,0);
        g2D.drawLine(50,400,50,0);
        g2D.drawLine(100,400,100,0);
        g2D.drawLine(150,400,150,0);
        g2D.drawLine(200,400,200,0);
        g2D.drawLine(250,400,250,0);
        g2D.drawLine(300,400,300,0);
        g2D.drawLine(350,400,350,0);
        g2D.drawLine(400,400,400,0);

    }
}
