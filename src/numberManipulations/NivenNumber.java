package numberManipulations;

/**
 * @author rajatsrivastava
 **/
public class NivenNumber {
    public static void main(String[] args) {
        int num = 156;
        nivenNumber(num);
        int num1 = 123;
        nivenNumber(num1);
    }

    private static void nivenNumber(int num) {
        int m = num;
        int sum = 0;
        while (num != 0) {
            int d = num % 10;
            sum = sum + d;
            num = num / 10;
        }
        if (m % sum == 0) {
            System.out.println(m + " is s nivenNumber");
        } else {
            System.out.println(m + " is not a nivenNumber");
        }
    }
}