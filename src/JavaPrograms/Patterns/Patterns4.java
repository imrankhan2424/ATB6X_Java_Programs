package JavaPrograms.Patterns;
public class Patterns4 {
    public static void main(String[] args) {
        pattern41(6);
    }

    private static void pattern41(int n) {
        int num=65;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int value=num+j-1;
                System.out.print((char)value+" ");}
            System.out.println();
        }
    }
}
