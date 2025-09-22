public  class Datatype
{   
  public static void isAverage(int a , int b, int c ,int number)
  {   int total=a+b+c;
     int Average= total/ number;
      System.out.print("Average of number :"+Average);
  }
    public static void main(String[] args) {
     int a=10,b=10,c=10,number=3;
     isAverage(a, b, c, number);   
    }
}
