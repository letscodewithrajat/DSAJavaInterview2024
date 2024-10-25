package recusrsion;

/**
 * @author rajatsrivastava
 **/
public class DecimalToBinary {
    public static void main(String[] args) {
        decTobinary(10);
    }

    private static void decTobinary(int num) {
        if (num == 0){
            return;
        }
        decTobinary(num/2);
        System.out.print(num%2);
    }

}
