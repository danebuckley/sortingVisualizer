import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.text.FlowView;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener{ 

    graphPanel graphPanel;
    dropboxPanel dropbox;

    public MyFrame() {
        dropbox = new dropboxPanel();
        graphPanel = new graphPanel();        
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setResizable(false); //this will be fixed later
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(dropbox);
        this.add(graphPanel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }
}
