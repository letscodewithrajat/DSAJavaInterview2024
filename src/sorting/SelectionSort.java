package sorting;

/**
 * @author rajatsrivastava
 **/
public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2,11, 7, 3, 6, 4, 5};
        selectionSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }
    private static void selectionSort(int[] array) {

        for (int i = 0 ; i < array.length;i++){
            int min = i;
            for (int j = i+1; j < array.length;j++){
                if (array[j] < array[min]){
                    min=j;
                }
            }
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i]=temp;
            }
        }
        }




}
