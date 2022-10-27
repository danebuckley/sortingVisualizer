import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Main extends JFrame { 

    public static void main(String[] args) {
        SortingAlgorithms sort = new SortingAlgorithms();
        int[] testArray = {8,2,3,4,5,9};
        System.out.println(Arrays.toString(sort.selectionSort(testArray)));
        //new MyFrame();
    }

    

}