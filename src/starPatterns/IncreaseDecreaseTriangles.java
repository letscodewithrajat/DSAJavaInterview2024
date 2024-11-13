package starPatterns;

/**
 * @author rajatsrivastava
 **/
public class IncreaseDecreaseTriangles {
    public static void main(String[] args) {

        int n=5;
        increaseTriangle(n);
        decreaseTriangle(n);
    }

    private static void increaseTriangle(int n) {
        for (int i =1 ; i <=n; i++){
            for (int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void decreaseTriangle(int n) {
        for (int i =1 ; i <=n; i++){
            for (int j = i ; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
