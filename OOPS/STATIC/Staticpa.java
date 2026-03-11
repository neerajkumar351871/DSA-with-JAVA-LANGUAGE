public class Staticpa
{
public static void main(String args[])
    { // First  Student.
        data student1 = new data();
        student1.setname("Neeraj kumar");
        student1.setCollegeName("HIMT");
        student1.getdata();
     
     // Second Student
        data student2 = new data();
        student2.setname("Neeraj kumar");
       // student2.setCollegeName("IMS GHAZIABAD");
        student2.getdata();
     
        
    }
}


class data
{
    String name;
    static String collegname;
     public  void setname(String name)
     {
         this.name= name;
     }
     public void setCollegeName(String  collegname)
     {
         this.collegname=collegname; 
     }
      public void  getdata()
      {
          System.out.println("Student name:"+name);
          System.out.println("COllege name:"+collegname);
    }
    
}