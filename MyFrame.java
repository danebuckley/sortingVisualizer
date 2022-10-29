import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.text.FlowView;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener {  

    graphPanel graphPanel;
    JComboBox dropbox;
    int[] intArray;

    public MyFrame(int [] arrayToSort) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        intArray = arrayToSort;
        final String[] sortTypes = {"Select a sorting method", "Selection Sort"};
        JComboBox dropbox = new JComboBox<>(sortTypes);
        this.setPreferredSize(new Dimension(500,40));
        dropbox.addActionListener(this);
        graphPanel = new graphPanel(arrayToSort);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setResizable(false); //this will be fixed later
        this.add(dropbox);
        this.add(graphPanel);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==dropbox) {
            System.out.println(dropbox.getSelectedIndex());
        }
    }


}
