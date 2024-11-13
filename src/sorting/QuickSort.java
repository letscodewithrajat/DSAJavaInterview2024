package sorting;

/**
 * @author rajatsrivastava
 **/
public class QuickSort {

    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        quickSort(array, 0, array.length-1);
        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if(end <=start) return;


    }

    private static int partition(int[] array, int start, int end) {

      return 1;


    }
}
