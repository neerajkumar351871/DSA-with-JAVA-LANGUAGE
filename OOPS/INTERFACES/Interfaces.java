public class Interfaces
{
    public static void  main(String args[])
    {
     Rook s= new Rook();
     s.move();
    }
}
interface  chess
{
 void move();
}
class  Queen implements chess
{  
    public  void move()
    {
        
    
    System.out.print("Up, Down left, Right ,diagonal, (All four direction)");
    }
}
class  Rook implements chess
{
    public void move()
    {
        System.out.print("up ,down , left,right");
    }
}
class king implements chess
{
    public  void move()
    {
        System.out.print("up,down, left,right");
    }
}
