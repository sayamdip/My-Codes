import java.util.*;
public class ReturnFunction {
    public static void main(String[] args){
        int ans=sum();
        System.out.println("Sum Of 2 Numbers= "+ans);
    }
    //Function

    static int sum(){  // Here Static Is The Access Modifier In Detailed In OOPs
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        System.out.print("Enter 1st Number= ");
        a=sc.nextInt();
        System.out.print("Enter 2nd Number= ");
        b=sc.nextInt();
        sum=a+b;
        return sum;
    }
}
