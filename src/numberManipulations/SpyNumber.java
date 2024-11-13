package numberManipulations;

/**
 * @author rajatsrivastava
 **/
public class SpyNumber {
    public static void main(String[] args) {
        int num = 3452;
        spyNumber(num);
        int num1 = 123;
        spyNumber(num1);
    }

    private static void spyNumber(int num) {
        int m=num;
        int sum = 0, prod =1 ;
        while (num != 0 ){
            int d = num %10;
            sum = sum  + d;
            prod = prod * d;
            num = num /10;
        }
        if(sum == prod){
            System.out.println(m+" is s spyNumber");
        }else {
            System.out.println(m + " is not a spyNumber");
        }
    }
}
