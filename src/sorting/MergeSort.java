package sorting;

/**
 * @author rajatsrivastava
 **/
public class MergeSort {
    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        mergeSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void mergeSort(int[] array) {
        if (array.length <=1){
            return;
        }
        int mid = array.length/2;
        int leftArray[] = new int[mid];
        int rightArray[] = new int[array.length- mid];
        int j=0, k=0;
        for (int i = 0 ; i < array.length;i++){
            if(i<mid){
                leftArray[j] = array[i];
                j++;
            }else {
                rightArray[k] = array[i];
                k++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }

    private static void merge(int[] leftArray,int[] rightArray, int[] array) {
        int l = 0, r=0, i =0;

        while (l< leftArray.length && r< rightArray.length){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                l++;
                i++;
            }else {
                array[i] = rightArray[r];
                r++;
                i++;
            }
        }
        while (l < leftArray.length){
            array[i] = leftArray[l];
            l++;
            i++;
        }
        while (r < rightArray.length){
            array[i] = rightArray[r];
            r++;
            i++;
        }
    }

}
