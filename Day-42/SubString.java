public class SubString
{
 public static void SubStrings(int si, int ei, String str)
    {
    // Si Starting index.
    // EI Ending index
      String substr ="";
    for(int i=si;i<ei;i++)
    {
    substr+=str.charAt(i);
    }
    System.out.print(substr+" ");
    }
    public static void main(String args[])
    {
        String  name="HelloWolrd";
        System.out.print(name.substring(0, 5));//USing function.
     // SubStrings(0, 5, name);

    }
}