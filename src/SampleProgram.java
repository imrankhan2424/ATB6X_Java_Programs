public class SampleProgram {
    public static void main(String[] args) {
        System.out.println("Hi Imran!");
        System.out.println("======");

        StringBuffer s=new StringBuffer("ImranKhan!");
        System.out.println(s.reverse());

        System.out.println("======");
        System.out.println("Reverse String");
        s.indexOf("Imran");
        String i="ImranKhan";
        String part1=i.substring(0,i.indexOf("Khan"));
        String part2=i.substring(i.indexOf("Khan"));
        String reverse=part2.concat(part1);
        System.out.println(reverse);

        int a=10;
        int b=12;
        int c=-20;
        System.out.println(Math.max(a,b));
        System.out.println(Math.abs(c));

    }
}
