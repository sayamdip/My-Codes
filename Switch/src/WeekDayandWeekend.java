import java.util.*;
public class WeekDayandWeekend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter A Day To Check Weekday Or Weekend= ");
        String day=sc.nextLine();
        switch(day){
            case "Monday":
                System.out.println("Weekday");
                break;
            case "Tuesday":
                System.out.println("Weekday");
                break;
            case "Wednesday":
                System.out.println("Weekday");
                break;
            case "Thursday":
                System.out.println("Weekday");
                break;
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter A Valid Day");
        }


    }
}
