import java.util.Scanner;
public class CelciusToFarenheit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature In Celcius= ");
        float a=sc.nextFloat();    //Using Double- double a=sc.nextDouble();
        float fern=(a*(9/5f))+32;  //Using Double- double fern=(a*(1.8))+32;
        System.out.print("In Ferenheit= "+fern);
        sc.close();
    }
}
