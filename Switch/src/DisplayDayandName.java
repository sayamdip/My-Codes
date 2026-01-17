import java.util.*;
public class DisplayDayandName {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number For The Day Of A Week= ");
        int a=sc.nextInt();

        //This Is A New Format Of Switch Cases
        switch(a){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter A Valid Number Only");
        }
    }
}
