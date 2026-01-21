import java.util.*;
public class Swap2Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number= ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number= ");
        int b=sc.nextInt();
        System.out.println("Before Swap= "+a+","+b);
        swap(a,b);
    }
    static void swap(int p,int o){
        //Swap 2 Numbers
        int temp=p;
        p=o;
        o=temp;
        System.out.println("After Swap= "+p+","+o);
    }
}
