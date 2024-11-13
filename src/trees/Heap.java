package trees;

import arrays.DynamicArray;

/**
 * @author rajatsrivastava
 **/
public class Heap {

    public static void main(String[] args) {

        DynamicArray array = new DynamicArray(16);
        array.add(50);
        array.add(30);
        array.add(40);
        array.add(10);
        array.add(5);
        array.add(20);
        array.add(30);

       insert(array, array.size() , 60);

    }

    private static void insert(DynamicArray array, int size, int value) {

        size = size +1 ;
        array.add(value);
        int i = size;
        while(i > 1){
            int parentIndex = i/2;
            if((int)array.get(parentIndex) <  (int)array.get(i) ){
                swap(array, parentIndex, i);
              i = parentIndex;
            }
            else {
                return;
            }
        }

    }

    private static void delete(DynamicArray array, int size) {

        array.insert(0, array.get(size));
        int n = size - 1;
        int i = 1;
        while (i < n) {
            int left = (int) array.get(2 * i);
            int right = (int) array.get(2 * i + 1);
            int largestIndex = left > right ? 2 * i : 2 * i + 1;

            if ((int) array.get(i) < (int) array.get(largestIndex)) {
                swap(array, i, largestIndex);
                i = largestIndex;
            } else {
                return;
            }
        }

    }


    private static void swap(DynamicArray array, int parentIndex, int i) {
        int temp = (int) array.get(parentIndex);
        array.insert(parentIndex, array.get(i));
        array.insert(i, temp);
    }
}
