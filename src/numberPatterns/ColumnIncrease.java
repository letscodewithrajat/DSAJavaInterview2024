package numberPatterns;

/**
 * @author rajatsrivastava
 **/
public class ColumnIncrease {
    public static void main(String[] args) {
        int n=5;
        for(int i =1 ; i <= n; i++){
            int p=1;
            for (int j=1; j<=i;j++){
                System.out.print(p);
                p++;
            }
            System.out.println();
        }

        for(int i =1 ; i <= n; i++){
            int p=1;
            for (int j=1; j<=i;j++){
                System.out.print(" ");

            }
            for (int j=i; j<=n;j++){
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
        for(int i =1,k=n ; i <= n; i++,k--){
            int p=k;
            for (int j=1; j<=i;j++){
                System.out.print(" ");

            }
            for (int j=i; j<=n;j++){
                System.out.print(p);
                p--;
            }
            System.out.println();
        }
        for(int i =1 ; i <= n; i++){
            int p=1;
            for (int j=i; j<=n;j++){
                System.out.print(" ");
            }
            for (int j=1; j<i;j++){
                System.out.print(p++);

            }
            for (int j=1; j<=i;j++){
                System.out.print(p--);

            }
            System.out.println();
        }

    }
}
