import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Fruit= ");
        String a=sc.nextLine();

        switch(a){
            case "Mango":
                System.out.println("King Of Fruit");
                break;
            case "Apple":
                System.out.println("A Sweet Red Fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "Grape":
                System.out.print("Small Fruit");
                break;
            default:
                System.out.println("Please Enter A Valid Fruit");

        }

    }
}
