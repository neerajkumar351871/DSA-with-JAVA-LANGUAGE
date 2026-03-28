public class Super
{
  public static void main(String agrs[])
  {
      horse h = new horse();
      
  }
}
class Animal
{
  Animal()
  {
    System.out.println(" Animal Class......");
  }
     public void  add()
     {
        System.out.println(2+4);
     }
}
class  horse extends Animal
{
  horse()
  {
    super();
   
    System.out.println(" Horse class ....");
     super.add();
  }
}