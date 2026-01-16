import java.util.Scanner;
public class CountOccurencesOfADigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number= ");
        long a=sc.nextLong();

        System.out.print("Enter Number To Check Occurence= ");
        int b=sc.nextInt();
        long num,count=0;
        while(a!=0){
            num=a%10;
            a=a/10;
            if(num==b){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
