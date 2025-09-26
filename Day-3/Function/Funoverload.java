public  class  Funoverload
{    public static  void add(int a, int b)
    {
       int sum=a+b;
       System.out.println("Add is:"+sum);
   }
    public static  void add(float  a, float  b)
    {
       float sum=a+b;
       System.out.println("Add is:"+sum);
   }
    public static  void add(double   a, double   b)
    {
       double sum=a+b;
       System.out.println("Add is:"+sum);
   }
    public static void main(String[] args) {
         float a=10f,b=20f;
         add(a,b);
    }
}