public class CountLowercase
{
    public static  int CountLowercase(String  valString)
    {
      String value= valString;
    int count=0;
      for(int i=0;i<valString.length();i++)
      {  char ch= valString.charAt(i);
        if(Character.isLowerCase(ch))
        {
         count++;
        }

      }
    return  count;
    }
    public static void main(String args[])
    {
       String  value=" Iam neeraj kumar";
       System.out.println(CountLowercase(value));
    }
}