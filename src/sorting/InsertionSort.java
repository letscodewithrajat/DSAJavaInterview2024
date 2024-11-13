package sorting;

/**
 * @author rajatsrivastava
 **/
public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {9, 1, 8,13, 2, 7, 3, 11,6, 4, 5};
        insertionSort(array,"Hi");
        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void insertionSort(int[] array,String str) {

        for (int i =1; i < array.length ;i++){
            int j=i;
            while(j>0 && array[j-1] > array[j]){
              int  temp = array[j-1];
              array[j-1] = array[j];
              array[j] = temp;
              j--;
            }
        }

    }

    private static void insertionSort(int[] array) {
        for(int i =1; i <array.length;i++){
            int temp = array[i];
            int j= i-1;
            while(j>=0 && array[j] > temp){
                array[j+1] =array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }


}
