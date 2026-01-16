import java.util.*;
public class WhileLoop {
    public static void main(String[] args){
        int a=1;

        // Print Number From 1 To 5
        while(a<6){  //Use While Loop When You Dont Know How Many Times
                    // A Loop Will Run
            System.out.println(a);
            a=a+1;
        }

        //Print Hello World N Times
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int p=sc.nextInt();
        int o=1;
        while(o<=p){
            System.out.println("Hello World");
            o=o+1;
        }
    }
}
