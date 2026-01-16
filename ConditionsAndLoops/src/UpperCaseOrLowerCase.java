import java.util.*;
public class UpperCaseOrLowerCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A String= ");
        String a=sc.nextLine();

        System.out.print("Enter A Number For Position= ");
        int p=sc.nextInt();

        char ch=a.trim().charAt(p); //This Is Using Python String Library
        System.out.println("Character At "+p+"th Position= "+ch);

        if(ch>='a' && ch<='z'){
            System.out.println(ch+" Is In Lower Case");
        }
        else{
            System.out.println(ch+" Is In Upper Case");
        }
    }
}
