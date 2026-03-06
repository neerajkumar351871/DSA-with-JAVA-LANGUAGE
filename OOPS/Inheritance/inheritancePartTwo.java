// Hierarchial inheritance
public class inheritancePartTwo
{
    public static void main(String args[])
    {
       Mammals s1= new Mammals();
       s1.eat();
       s1.walk();
    }
}
// Base class
class Animal
{
     void eat()
     {
        System.out.println("Eat");
     }
     void breath()
     {
        System.out.println("Breathing");
     }
}
// child class
class fish extends Animal
{
    void swim()
    {
        System.out.print("Swiming");
    }
}
// child class
class Bird  extends Animal
{  
    void fly()
    {
    System.out.print("Bird Fly");
}
}
class Mammals  extends Animal
{
    void walk()
    {
    System.out.println("Walk");
}
}