
public class Stringrev {

    public static String revstring(StringBuilder str) {
        str.reverse();
        String ans = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            StringBuilder words =  new StringBuilder("");
            while (i < n && str.charAt(i) != ' ') {
                words.append(str.charAt(i));
                  i++;
            }
            words.reverse();
            if (words.length() > 0) {
               ans= ans+words.toString()+" ";
            }
        }
           
     return ans;
    }

    public static void main(String args[]) {
        StringBuilder data = new StringBuilder("This is pen");
       System.out.println(data);
       System.out.println("Before");
       System.out.println(revstring(data));
    }
}
