import java.util.*;
public class LargestOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number= ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number= ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd Number= ");
        int p=sc.nextInt();

        // One Method
//        if(a>b && a>p){
//            System.out.println(a+" Is The Largest");
//
//        }
//        else if(b>a && b>p){
//            System.out.println(b+" Is The Largest");
//        }
//        else{
//            System.out.println(p+" Is The Largest");
//        }

        // Using Maths Library Also This Is Optimized
        int max=Math.max(p,Math.max(a,b));
        System.out.println("Largest Number Is= "+max);

    }
}
