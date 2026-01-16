import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a="y";
        while(a!="n"){
            System.out.print("Enter Your Choice(y/n)= ");
            a=sc.nextLine();
            System.out.print("Enter 1st Number= ");
            double b=sc.nextInt();
            System.out.print("Enter 2nd Number= ");
            double p=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter An Operator= ");
            String op=sc.nextLine();
            double ans;

            if(op=="+" || op=="-" || op=="*" || op=="/"){
                if(op=="+"){
                     ans=b+p;
                    System.out.println(b+op+p+"="+ans);
                }
                else if(op=="-"){
                     ans=b-p;
                    System.out.println(b+op+p+"="+ans);
                }
                else if(op=="*"){
                     ans=b*p;
                    System.out.println(b+op+p+"="+ans);
                }
                else if(op=="/"){
                     ans=b/p;
                    System.out.println(b+op+p+"="+ans);
                }
            }
            else{
                System.out.println("Enter A Valid Operator");
            }
        }
    }
}
