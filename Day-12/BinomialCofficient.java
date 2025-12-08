public class  BinomialCofficient
{   
    public static int factorail(int n)
{
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact*=i;
    }
  return  fact;
} 
 public static  int BinomialCofficient(int n, int r)
{
    // Calculate n!
    int numFact=factorail(n);
    // Calculate r!
    int rfact=factorail(r);
    // Calculate (n-r)!
    int n_rfact=factorail(n-r);
    // calculate Binomial Cofficient
    int binomialcofficient=numFact/(rfact*n_rfact);


return binomialcofficient;
}

    public static void main(String[] args) {
        int n=7;
        int r=;
        int result=BinomialCofficient(n, r);
        System.out.println("Factorail of this number:"+result);
        
    }
}