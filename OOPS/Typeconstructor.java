public class Typeconstructor
{

   public static void main(String args[])
   {
       constructor s1= new constructor();
       constructor s2= new constructor("Neeraj");
       constructor s3= new  constructor(983);
   }
}
 class constructor
 {
    String name;
    int rollno;
    constructor()
    {
        System.out.println("Hello i am  Non paramterized constructor");
    }
    constructor(String name)
    {
        System.out.println("Hello i  am Paramterized constructor"+" Name is :"+name);
    }
    constructor(int rollno)
    {
        System.out.println("Hello i am patamterized constructor:"+"Roll no is :"+rollno);
    }
 }