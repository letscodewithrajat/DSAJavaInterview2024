package numberPatterns;

/**
 * @author rajatsrivastava
 **/
public class IncreasingTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i =1 ; i <= n; i++){
            for (int j=1; j<=i;j++){
                //System.out.print("*");
                System.out.print("1");
            }
            System.out.println();
        }

        for(int i =1,p=1 ; i <= n; i++,p++){
            for (int j=1; j<=i;j++){
                System.out.print(p);
            }
            System.out.println();
        }

        for(int i =1 ; i <= n; i++){
            int p=1;
            for (int j=1; j<=i;j++){
                System.out.print(p);
                p++;
            }
            System.out.println();
        }
        for(int i =1 ; i <= n; i++){
            int p=n;
            for (int j=1; j<=i;j++){
                System.out.print(p);
                p--;
            }
            System.out.println();
        }
    }
}
