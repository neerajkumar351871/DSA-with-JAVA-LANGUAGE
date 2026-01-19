
public class Constructor {

    public static void main(String args[]) {
     //   Student p1 = new Student(98, "Neeraj kumar");// Parameter constructor;
        // System.out.println(p1.name);
        // System.out.println(p1.Roll_no);
    
    // Default constructor;
       Student p1 =new Student();

    }
}

class Student {

    String name;
    int Roll_no;

    // public Student(int Roll_no, String name) {
    //     this.name = name;
    //     this.Roll_no = Roll_no;
    // }  Parameter constructor;
    Student() {
        System.out.println("Constructor is called ....");
    }

    
}
