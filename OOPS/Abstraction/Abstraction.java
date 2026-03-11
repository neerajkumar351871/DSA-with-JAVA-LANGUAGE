
public class Abstraction {

    public static void main(String agrs[]) {
        printdata s1 = new printdata("Red");
        s1.show();
        

    }
} // We are  not creat  object . But make a constructor.
// abstract  is idea/ blue print.

abstract class Animal {
    String color;
    //    Animal( String  color)
    //    {
    //          System.out.print(color);
    //    }
  
    // abstract function.
    abstract void show(); // we are not write defination.

    //Non abstract function.
    void displaydata() {
        System.out.print("I am Non-Abstract class !");
    }
}

class printdata extends Animal {

 
  printdata(String color)
  {
    System.out.println(color);
  }

    // Mendontry to implement the show function();
    void show() {
        System.out.println("I am Abstract function ! ");
    }
}

