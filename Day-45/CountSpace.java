public class CountSpace
{
    public static   int CountSpace(String seString)
    {
        int countSpcae=0;
        for(int i=0;i<seString.length();i++)
        {  char ch=  seString.charAt(i);
           if(ch == ' ')
           {
            countSpcae++;
           }
        }
        return  countSpcae;
    }
public static void main(String[] args) {
     String sentence="I am neeraj kumar";
     System.out.println("Total space:"+CountSpace(sentence));
}
}