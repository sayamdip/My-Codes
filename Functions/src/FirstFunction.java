import java.util.Scanner;
public class FirstFunction {
    public static void main(String[] args) {
        //Q: Take An Input Of Two Numbers And Print The Sum (Do This 5 Times)
        sum();
        sum();
        sum();
        sum();
        sum();

    }
        //Function

        static void sum(){  // Here Static Is The Access Modifier In Detailed In OOPs
            Scanner sc = new Scanner(System.in);
            int a,b,sum;
            System.out.print("Enter 1st Number= ");
            a=sc.nextInt();
            System.out.print("Enter 2nd Number= ");
            b=sc.nextInt();
            sum=a+b;
            System.out.println("Sum Of 2 Numbers= "+sum);
        }



}
