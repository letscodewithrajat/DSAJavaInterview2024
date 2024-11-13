package sorting;

/**
 * @author rajatsrivastava
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {9, 1, 8,13, 2, 7, 3, 6, 4, 5};
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }


    private static void bubbleSort(int[] array) {
for (int i = 1 ; i <= array.length;i++){
    for (int j = 0; j < array.length-i;j++){
        if(array[j]> array[j+1]){
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1]=temp;
        }
    }
}
    }



}
