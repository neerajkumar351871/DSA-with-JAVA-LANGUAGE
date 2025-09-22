  public  class  Test2
  {
    public static void main(String[] args) {
       /* int x=200, y=50,z=100;
        if(x>y && y>z)
        {
            System.out.print("Hello");
        }
        if(z>y && z<x)
        {
            System.out.print("java");
        }
        if((y+200)<x && (y+150)<z)
        {
            System.out.print("Hello java");
        }
        */
          int x,y,z;
      x=y=z=2; //  Each value  have =2;
      x +=y;   // x=x+y 2+2=4   x=4 
      y-=z;    // y= y-z 2-2    y=0
      z/=(x+y); // z=2(4+0)     z=2
       System.out.print("X:"+x+"Y:"+y+"z" + z);
    
   
    }
  }