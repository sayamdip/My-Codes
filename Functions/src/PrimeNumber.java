import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int a=sc.nextInt();
        prime(a); //Prime Number Function
    }

    //Prime Number Function
    static void prime(int p) {
        int count=0;
        if(p==2){
            count=0;
        }
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                count = 1;
            }
        }
        if(count==1){
            System.out.println("Not A Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }
        }
    }
