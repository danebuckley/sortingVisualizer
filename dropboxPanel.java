import javax.swing.*;
import java.awt.*;

public class dropboxPanel extends JPanel {
    dropboxPanel() {
        final String[] sortTypes = {"Select a sorting method", "Selection Sort"};
        JComboBox boxOfSort = new JComboBox<>(sortTypes);
        this.setPreferredSize(new Dimension(500,40));
        this.add(boxOfSort);
    }
}
