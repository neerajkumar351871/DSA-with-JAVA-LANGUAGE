public class inheritancePartThree
{
    public  static void main(String args[])
    {
      Shark n = new Shark();
      n.Sharkfishcolor();
      
    }
}//  Hybrid Inhetitance
class Animal
{
    void eat()
    {
        System.out.print("Animal are eat !");
    }
    void  color()
    {
        System.out.print("Animal are white.");
    }
}
class  Fish  extends Animal{
    void swim()
    {
        System.out.print(" fish Swiming in the water.");
    }
}
class  Tuna   extends  Fish
{
     void  Tunafishcolor()
    {
        System.out.print("Deep  Red and pink.");
    } 
}
class Shark  extends Fish
{
   void Sharkfishcolor()
   {
System.out.print("Brown and gray.");
 }
}
class Bird   extends Animal{
    void fly()
    {
        System.out.print("Bird are fly in the sky.");
    }

}class peacock extends Bird 
{
  void peacokccolor()
  {
    System.out.print("Peacock color is Deep blue-green"); 
 }

}
class crow extends Bird
{
   void Crowcolor()
   {
    System.out.print("Crow color is  black");
   }
}
class  Mammals  extends Animal
{
  void  walk()
  {
    System.out.print("Mammals  are walk in the land");
  }
 
}
class Cat extends Mammals 
{
  void catcolor()
  {
    System.out.print("Cat color is Brown");
  }
}
class  elephant extends Mammals
{
   void elephantcolor()
   {
    System.out.print("Elephant color is Black");  
     }

}





