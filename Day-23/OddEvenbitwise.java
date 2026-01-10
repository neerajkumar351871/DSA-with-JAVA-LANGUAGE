
import java.util.Scanner;

public class OddEvenbitwise
{  public static void IsoddEven(int n)
{
    int bitMask=1;
   //  System.out.println(n&bitMask);
    if((n&bitMask)==0)
    {
        System.out.println("number is Even: "+n);
    }
    else
    {
     System.out.println("Number is odd :"+n);
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check even or not:");
        int n =sc.nextInt();
          IsoddEven(n);       
    }
}