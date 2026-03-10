public class Multipleinterface
{
    public static void main(String args[])
    {
        testing s1= new testing();
        s1.demo1();
        s1.demo2();

    }
}

interface demo
{
    void demo1();
}
interface demos
{
    void demo2();
}

class testing implements demo,demos
{
   public void   demo1()
   {
    System.out.println("Demo 1 Sucess...");
   }
   public  void demo2()
   {
    System.out.print("Demo 2 Sucess...");
   }

}