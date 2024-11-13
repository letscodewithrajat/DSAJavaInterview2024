package numberManipulations;

/**
 * @author rajatsrivastava
 **/
public class SpecialNumber {
    public static void main(String[] args) {
        int num = 59;
        specialNumber(num);
        int num1 = 123;
        specialNumber(num1);
    }

    private static void specialNumber(int num) {
        int m = num;
        int sum = 0, prod = 1;
        while (num != 0) {
            int d = num % 10;
            sum = sum + d;
            prod = prod * d;
            num = num / 10;
        }
        if (sum + prod == m) {
            System.out.println(m + " is s specialNumber");
        } else {
            System.out.println(m + " is not a specialNumber");
        }
    }
}
