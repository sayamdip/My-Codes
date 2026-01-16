import java.util.Scanner;
public class TypeConversionandCasting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter An Integer Number= ");
        int a=sc.nextInt();

        //Convert To Float
        float p=(float)(a);

        //Convert To Byte
        byte b=(byte)(a);

        //Convert To Double
        double o=(double)(a);

        System.out.println("Integer= "+a);
        System.out.println("Float= "+p);
        System.out.println("Byte= "+b);
        System.out.println("Double= "+o);
    }
}
