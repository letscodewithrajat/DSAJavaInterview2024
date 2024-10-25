package recusrsion;

/**
 * @author rajatsrivastava
 **/
public class ReverseNumber {
    public static void main(String[] args) {
        rev(468);
    }

    private static void rev(int num) {
        if(num ==0){
            return;
        }
        System.out.print(num%10);
        rev(num/10);
    }
}
