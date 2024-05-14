package JavaPrograms.Patterns;

public class Patterns1 {
    public static void main(String[] args) {
//        pattern1(6);
//        pattern2(7);
        pattern3(5);
    }
    public static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int j=1;j<=row;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int row=1;row<=n;row++) {
            for (int col = 1; col <= n - row + 1 ; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=1;i<=(2*n);i++){
            int no_of_stars= (i<=n) ? i:2*n-i;
            for (int j=1;j<=no_of_stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
