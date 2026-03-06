public class inheritance
{
    public static void main(String args[])
    {
    //   Animal s1= new Animal();
    //   s1.eat();
    //     Fish s1= new Fish();
    //     s1.eat();
    //     s1.Swim();
      Dog dogs= new Dog();
      dogs.eat();
      dogs.legs="4";
      System.out.print("Dog legs:"+dogs.legs);
     }
   
}
// Base calss
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eat");
    }
    void breath()
    {
        System.out.println("Breath");
    }
}
// Child class -> Derived Class
class Fish extends Animal
{
    int fins;
     
     void Swim()
     {
        System.out.print("Swims");
     }
}
class Dog extends  Fish
{
    String legs;
}
