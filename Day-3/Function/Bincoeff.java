public class Bincoeff
{   public static  int factorial(int fact)
{
    int factorials=1;
    for(int i=1;i<=fact;i++)
    {
        factorials*=i;
    }
    return  factorials;
    
}
  public static void bincoeff(int n,int r)
  {
    int a=factorial(n);
    int b=factorial(r);
    int c= factorial(n-r);
    int value= a/(b*c);
     System.out.print("Binomial Cofficient:"+value);
  }

    public static void main(String[] args) {
     int n=5,r=2;
     bincoeff(n, r);

    }
}