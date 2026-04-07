class Factorial
{  
     public static  int fact(int n)
{   int fact=1;
    if(n==0)
    {
      return 1;
    }
   int fnm1= fact(n-1);// This line print the number 1,2,3,4,5.
   int fn = n*fact(n-1); // This line help to calculate the factorial.
    return fn;
}
    public static void main(String args[])
    {
       System.out.print(fact(5));
    }
}