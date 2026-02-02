public class CreateString
{
    public static void printString(String  name)
    {
      for(int i=0;i<name.length();i++)
      {
          System.out.println(name.charAt(i));
      }
    }
 
    public static void main(String args[])
  {
    //    Create  String.
     String name= "Neeraj";
   //String  name= new String();
   //     Take a string inputs.  
   //Scanner sc= new Scanner(System.in);
   //System.out.println("Enter the name:");
   //name= sc.next();// Only take single words.
   //name= sc.nextLine();// take a sentences.
   //System.out.println(name);


   //  Count length.
//    String name="Neeraj";
//    System.out.print(name.length());

   // Concanate the Strings.

//    String   name="Neeraj";
//    String full="Singh";
//    System.out.print(name+full+".");
      printString(name);

  }
}