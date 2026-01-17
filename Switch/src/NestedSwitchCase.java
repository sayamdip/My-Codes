import java.util.*;
public class NestedSwitchCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter An Employ Number= ");
        int empID=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter A Department= ");
        String dept=sc.nextLine();

        switch(empID){
            case 1:
                System.out.println("Sayamdip Dey Chaklader");
                break;
            case 2:
                System.out.println("Rick Dey Chaklader");
                break;
            case 3:
                System.out.println("Employ Number 3");
                switch(dept){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Avilable");
                }
            default:
                System.out.println("Enter Correct empID");

        }
    }
}
