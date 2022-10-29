import javax.swing.*;
import java.awt.*;

public class dropboxPanel extends JPanel {
    JComboBox boxOfSort;

    dropboxPanel() {

    }

    public String getSelected() {
        System.out.println(boxOfSort.getSelectedItem().toString());
        return boxOfSort.getSelectedItem().toString();
    }
    
}
