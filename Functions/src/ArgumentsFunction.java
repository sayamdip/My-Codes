import java.util.Scanner;
public class ArgumentsFunction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number= ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number= ");
        int b=sc.nextInt();
        int c=sum2(a,b);
        System.out.println("Sum Of 2 Numbers= "+c);
    }
    static int sum2(int p , int o){
        int sum=p+o;
        return sum;
    }
}
