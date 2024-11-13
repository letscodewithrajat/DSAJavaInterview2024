package numberManipulations;

/**
 * @author rajatsrivastava
 **/
public class Palindrome {
    public static void main(String[] args) {
        int num = 3452;
        palindrome(num);
        int num1 = 3443;
        palindrome(num1);
    }

    private static void palindrome(int num) {
        int m=num;
        int sum = 0;
        while (num != 0 ){
            int d = num %10;
            sum = sum * 10 + d;
            num = num /10;
        }
        if(sum == m){
            System.out.println(m+" is s Palindrome");
        }else {
            System.out.println(m + " is not a Palindrome");
        }
    }
}
