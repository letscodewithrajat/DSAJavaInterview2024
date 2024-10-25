package arrays;

/**
 * @author rajatsrivastava
 **/
public class SplitEvenOddArrays {
    public static void main(String[] args) {
        int arr[] = {3,1,2,56,65,5,7,10,45,34};
        splitEvenOddArraysPrint(arr);
    }

    private static void splitEvenOddArraysPrint(int[] arr) {
        int even=0 , odd =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] %2 == 0 ) even++;
            else odd++;
        }

        int evenArr[] = new int[even];
        int oddArr[] = new int[odd];
        int j=0,k=0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] %2 ==0) {
                evenArr[j] = arr[i];
                j++;
            }
            else {
                oddArr[k] = arr[i];
                k++;
            }
            }

        for (int i=0; i < j;i++){
            System.out.print(evenArr[i] + ",");
        }
        System.out.println();
        for (int i=0; i < k;i++){
            System.out.print(oddArr[i] +",");
        }

        }
    }


