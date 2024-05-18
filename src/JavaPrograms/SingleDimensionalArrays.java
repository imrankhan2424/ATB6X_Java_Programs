package NaveenAutomation;

public class SingleDimensionalArrays {
    public static void main(String[] args){
        int a[]=new int[5];

        for (int i=0;i<5;i++){
            a[i]=i;
        }
        System.out.println(a[3]);
        //Drawback:
        //1. Fixed Size -> Overcome - Collections
        //2. Fixed Datatype -> Overcome - Object arrays

        Object ob[]=new Object[3];
        ob[0]="Hi";
        ob[1]=3;
        ob[2]='V';

        int i=0;
        while(i<3){
            System.out.println(ob[i]);
            i++; //Drawback of while - without increment/decrement goes into loop
        }
       // System.out.println(ob[3]); //.ArrayIndexOutOfBoundsException Exception
    }
}
