package recusrsion;

/**
 * @author rajatsrivastava
 **/
public class Simply {
    public static void main(String[] args) {
        System.out.println(simply(5));
    }


    private static int simply(int n) {

        if(n==0) return 0;
        if (n==1) return 1;
        return simply(n-1) + simply(n-2);

    }
}
