package recusrsion;

/**
 * @author rajatsrivastava
 **/
public class LargestNumber {
    public static void main(String[] args) {
        int A[] = {10,40,60,50,20};
        System.out.println(largestNumber(A,A.length ));
    }

    private static int largestNumber(int[] a, int n) {
        int x;
        if(n==1){
            return a[0];
        }else {
       x= largestNumber(a,n-1);
       if (a[n-1] > x){
           return a[n-1];
       }
       else return x;
        }

    }
}
