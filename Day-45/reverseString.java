public class reverseString
{
    public static  void reverseString(String str)
    {
        String rev=" ";
        for(int i=0;i<str.length();i++)
        {
            rev= rev+str.charAt(str.length()-i-1);
        }
        System.out.println("AFTER:"+rev);
    }
 public static void main(String[] args) {
      String str="Neeraj";
      System.out.println("BEFORE:"+str);
      reverseString(str);
     
 }
}