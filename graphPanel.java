import javax.swing.*;
import java.awt.*;
import java.util.*;

public class graphPanel extends JPanel {

    SortingAlgorithms algBank;
    int[] array;

    graphPanel(int[] arrayToSort) {
        this.setPreferredSize(new Dimension(400,500));
        array = arrayToSort;
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0,0,0,44*array[0]);
        g2D.drawLine(50,0,50,44*array[1]);
        g2D.drawLine(100,0,100,44*array[2]);
        g2D.drawLine(150,0,150,44*array[3]);
        g2D.drawLine(200,0,200,44*array[4]);
        g2D.drawLine(250,0,250,44*array[5]);
        g2D.drawLine(300,0,300,44*array[6]);
        g2D.drawLine(350,0,350,44*array[7]);
        g2D.drawLine(400,0,400,44*array[8]);
    }

    public void somethingClicked(int[] intArray) {
        array = selectionSort(intArray);
    }


    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int curMin = i;
            for (int j = i+1; j < array.length; j++) { 
                if (array[j] < array[curMin]) {
                    curMin = j;
                    Graphics2D g2D = (Graphics2D) g;
                    g2D.drawLine(250,250,500,500);
                }
            }
            int temp = array[i];
            array[i] = array[curMin];
            array[curMin] = temp;
            repaint();
            
        }
        return array;
    }
}
