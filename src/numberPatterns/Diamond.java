package numberPatterns;

/**
 * @author rajatsrivastava
 **/
public class Diamond {
    public static void main(String[] args) {
        int p=1;
        for(int i =1 ; i < 5; i++,p++){
            for (int j= i; j<=5;j++ ){
                System.out.print(" ");
            }
            for(int j =1 ; j < i; j++){
                System.out.print(p);
            }
            for(int j =1 ; j <= i; j++){
                System.out.print(p);
            }

            System.out.println();
        }
        for(int i =1 ; i <= 5; i++,p++){
            for (int j=1 ; j<=i;j++){
                System.out.print(" ");
            }
            for (int j=i;j<5;j++){
                System.out.print(p);
            }
            for (int j=i;j<=5;j++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
