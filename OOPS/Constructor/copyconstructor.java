
public class copyconstructor {

    public static void main(String args[]) {
        copyconst s1 = new copyconst();
        s1.name = "Neeraj";
        s1.rollno = 98;
        s1.password = "1234";
        copyconst s2 = new copyconst(s1);
        s2.password = "abcdefgh";
        System.out.print(s2.password);
    }
}

class copyconst {

    String name;
    int rollno;
    String password;

    copyconst() {
        System.out.println("Constructor is  called...");
    }
  // Copy constructor;
    copyconst(copyconst s1) {
        this.name = s1.name;
        this.rollno = s1.rollno;
    }

}
