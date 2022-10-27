import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener{ 
    public MyFrame() {
        final String[] sortTypes = {"Select a sorting method", "Selection Sort"};
        final JTextField dropboxHeader = new JTextField("Choose a sorting algorithm");
        JComboBox boxOfSort = new JComboBox<>(sortTypes);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(new FlowLayout());
        boxOfSort.setMaximumSize(new Dimension(10,20));
        this.add(boxOfSort);
        
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }
}
