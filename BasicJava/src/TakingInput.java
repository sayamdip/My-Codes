import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int a = sc.nextInt();
        System.out.println("Your Entered Number= "+a);

        sc.nextLine();
        System.out.print("Enter A String= ");
        String b=sc.nextLine();
        System.out.println("Your Entered String= "+b);


        System.out.print("Enter A Float Number= ");
        float p=sc.nextFloat();
        System.out.println("Your Entered Float= "+p);
    }
}
