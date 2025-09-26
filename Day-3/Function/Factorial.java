public class Factorial
{  public static  int factorial(int fact)
{
    int factorials=1;
    for(int i=1;i<=fact;i++)
    {
        factorials*=i;
    }
    return  factorials;
    
}
        public static void  main(String args[])
    {
       int number=6;
       int data=  factorial(number);
       System.out.print("Factoril  this number:"+number+" After Factoril:"+data);
    }
}