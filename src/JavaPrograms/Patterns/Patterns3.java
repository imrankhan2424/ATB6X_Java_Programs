package JavaPrograms.Patterns;

public class Patterns3 {
    public static void main(String[] args) {
            pattern31(10);
        }

        private static void pattern31(int n) {
            for(int i=1;i<=n;i++){
                int total_no_of_spaces=n-i;
                for(int j=0;j<total_no_of_spaces;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }