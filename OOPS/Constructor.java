public class Constructor
{
  public static void main(String args[])
  {
     Student p1= new Student("Neeraj");
     System.out.print(p1.name);

  }
}
class Student
{
    String name;
    int roll;
    
    // Student()
    // {
    //     //System.out.print("Constructor is called...");
    // }
    
    Student(String name)
    {
        this.name=name;
    }
}