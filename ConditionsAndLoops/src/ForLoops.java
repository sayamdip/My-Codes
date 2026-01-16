import java.sql.SQLOutput;
import java.util.*;
public class ForLoops {
    public static void main(String[] args){
        //Print Number From 1 To 5
        for(int i=1;i<6;i++){
            System.out.println(i);
        }

        //Print Numbers From 1 To N
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int a =sc.nextInt();
        for(int p=0;p<a;p++){
            System.out.println("Hello World");
        }
    }
}
