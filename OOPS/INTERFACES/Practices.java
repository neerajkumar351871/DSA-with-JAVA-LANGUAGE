public class Practices
{
    public static void main(String args[])
    {
        Data student = new Data();

        student.setter(98, "Neeraj Kumar", "HIMT");
        student.setAge(12);
        student.getter();
    }
}

// Interface for student details
interface StudentDetails
{
    void setter(int rollno, String name, String collegeName);
    void getter();
}

// Interface for age
interface Age
{
    void setAge(int age);
}

// Class implementing both interfaces
class Data implements StudentDetails, Age
{
    int rollno;
    String name;
    String collegeName;
    int age;

    // Setter method
    public void setter(int rollno, String name, String collegeName)
    {
        this.rollno = rollno;
        this.name = name;
        this.collegeName = collegeName;
    }

    // Age method
    public void setAge(int age)
    {
        this.age = age;
    }

    // Getter method
    public void getter()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll No: " + rollno);
        System.out.println("Student College Name: " + collegeName);
        System.out.println("Student Age: " + age);
    }
}