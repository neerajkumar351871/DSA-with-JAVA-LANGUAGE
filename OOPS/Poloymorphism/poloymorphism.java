public class poloymorphism
{
  public static void main(String agrs[])
  { 
    Calculator cal= new Calculator();
    System.out.println(cal.sum(3,4));
    System.out.println(cal.sum((float)1.5,(float)2.5));
    System.out.println(cal.sum(3,4,3));

  }
}
// Compile time  (overloading).
class Calculator
{
    int sum(int a , int b)
    {
        return a+b;
    }
    float sum(float a , float b)
    {
       return a+b;
    }
    int sum(int a , int b, int c)
    {
        return a+b+c;
    }
}