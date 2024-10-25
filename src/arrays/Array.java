package arrays;

/**
 * @author rajatsrivastava
 **/
public class Array {
    public static void main(String[] args) {
        int arr[] = {3,1,2,56,65,5,7,10,45,34};
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i =0 ; i <arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void printEvenArray(int[] arr) {
        for (int i =0 ; i <arr.length;i++){
            if (arr[i] %2==0) {
                System.out.println(arr[i]);
            }
        }
    }

    private static void printSumArray(int[] arr) {
        int sum=0;
        for (int i =0 ; i <arr.length;i++){

            sum = sum+arr[i];
            }
        System.out.println(sum);
        }

}
