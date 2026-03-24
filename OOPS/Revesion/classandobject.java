
import java.util.*;

public class classandobject {

    public static void main(String args[]) {
        Student obj1 =  new Student();
        obj1.setterdata("NEERAJ KUMAR SINGH", 36,920001,5000);
        obj1.getterdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("IF YOU CHECK BALANCE THEN ENTER  1 ");
        int condition = sc.nextInt();
        if(condition == 1)
        {
          System.out.println("TOTAL BALANCE :"+obj1.balance());
        }
    }
}

class Student {

    String studentname;
    int rollno;
    int Contactno;
    private int balance;

     public void setterdata(String studentname, int rollno, int contactno, int balance) {
        this.studentname = studentname;
        this.rollno = rollno;
        this.Contactno = contactno;
        this.balance = balance;
    }

    public void getterdata() {

        System.out.println("STUDNET NAME : " + this.studentname);
        System.out.println("STUDNET ROLLNO IS : " + this.rollno);
        System.out.println("STUDNET CONTACT NO IS : " + this.Contactno);

    }

    public int balance() {
        return this.balance;
    }

}
