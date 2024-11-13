package numberManipulations;

/**
 * @author rajatsrivastava
 **/
public class BreakDigits {
    public static void main(String[] args) {
        int num = 3452;
        printDigits(num);
    }

    private static void printDigits(int num) {
        int m = num;
        while (num !=0 ){
            int d = num%10;
            System.out.println(d);
            num= num/10;
        }
    }
}
