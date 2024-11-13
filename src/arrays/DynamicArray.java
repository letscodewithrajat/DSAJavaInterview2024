package arrays;

import java.util.Iterator;

/**
 * @author rajatsrivastava
 **/
public class DynamicArray {

    Object[] arr;
    int size = 0;
    int capacity = 5;

    public DynamicArray() {
        this(5);
    }

    public DynamicArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Invalid capacity");
        arr = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        arr[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for(int i = size; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index]= data;
        size++;
    }

    public void delete(Object data) {
for (int i=0; i<size;i++){
    if (arr[i] == data){
        for(int j=0;j<size-i-1;j++){
            arr[i+j] = arr[i+j+1];
        }
        arr[size-1] = null;
        size--;
        if(size <= (int )(capacity/3)){
            shrink();
        }
        break;
    }
}


    }


    public int search(Object data) {
    for (int i =0;i<size;i++){
        if(arr[i] == data){
            return i;
        }
    }
        return -1;
    }

    public Object get(int index){
        return arr[index];
    }

    private void grow() {
        int newCapacity = capacity * 2;
        Object newArray[] = new Object[newCapacity];
        for(int i =0 ; i <size;i++){
            newArray[i] = arr[i];
        }
        arr = newArray;
        capacity = newCapacity;
    }

    private void shrink() {
        int newCapacity = ( int) (capacity / 2);
        Object newArray[] = new Object[newCapacity];
        for(int i =0 ; i <size;i++){
            newArray[i] = arr[i];
        }
        arr = newArray;
        capacity = newCapacity;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";
        for(int i =0; i <size;i++){
            string += arr[i] + ",";
        }
        if(string != "" ) {
            string = "[" + string.substring(0, string.length() - 1) + "]";
        }
        else{
            string = "[]";
        }

        return string;
    }


}
