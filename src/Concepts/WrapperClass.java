package Concepts;

public class WrapperClass {
    public static void main(String[] args) {
        // byte,short,int,long,float,double,char,boolean
        //        String to different data types
        String s="20";
        String b="true";

        System.out.println(Byte.parseByte(s));
        System.out.println(Short.parseShort(s));
        System.out.println(Integer.parseInt(s));
        System.out.println(Float.parseFloat(s));
        System.out.println(Double.parseDouble(s));
        System.out.println(s.charAt(0));
        System.out.println(Boolean.parseBoolean(b));

//        try{
//            System.out.println(Integer.parseInt(b));
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("NumberFormatException");
//        }

        System.out.println();
        System.out.println("Converting other datatype to String");
        byte i=127;
        System.out.println(String.valueOf(i));
        short k=2014;
        System.out.println(String.valueOf(k));
        System.out.println(String.valueOf(20));
        System.out.println(String.valueOf((long)20.23));
        System.out.println(String.valueOf(20.23f));
        System.out.println(String.valueOf(20.37));
        System.out.println(String.valueOf('d'));
        System.out.println(String.valueOf(true));
    }
}
