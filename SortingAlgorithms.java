
public class SortingAlgorithms {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int curMin = i;
            for (int j = i+1; j < array.length; j++) { 
                if (array[j] < array[curMin]) {
                    curMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[curMin];
            array[curMin] = temp;
        }
        return array;
    }
}
