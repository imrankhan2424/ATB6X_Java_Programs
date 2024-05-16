package JavaPrograms;

public class Charactercount {
    public static void main(String[] args) {
        String str="Hi my name is imran khan";
        charcount1(str,'m');
        charcount2(str,'m');
        charcount3(str,'m');
    }

    public static void charcount3(String str, char k) {
        long count= str.chars()
                .mapToObj(e-> (char)e)
                .filter(e-> e.equals(Character.valueOf(k))).count();
        System.out.println(count);
    }

    public static void charcount2(String str, char m) {
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch==m){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void charcount1(String str, char c) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}