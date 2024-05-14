package JavaPrograms.Patterns;


public class Patterns2 {
    public static void main(String[] args) {
        pattern21(10);
    }

    private static void pattern21(int n) {
        for(int i=1;i<=n;i++){
            int total_no_of_spaces=n-i;
            for(int j=0;j<total_no_of_spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
