import java.util.*;
public class Fibonacci_Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A Number= ");
        int p=sc.nextInt();
        int a=0,b=1,n;
        System.out.print(a+",");
        System.out.print(b+",");
        for (int i=2;i<p;i++){
            n=a+b;
            a=b;
            b=n;
            System.out.print(n+",");
        }
    }
}
