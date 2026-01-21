import java.util.*;
public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number= ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number= ");
        int b=sc.nextInt();
        PrimeRange(a,b);
    }
    static void PrimeRange(int p,int o){
        for(int i=p;i<o+1;i++){
            if(i>1){
                int count=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        count=1;
                    }
                }
                if(count==0){
                    System.out.println(i);
                }
            }
        }
    }
}