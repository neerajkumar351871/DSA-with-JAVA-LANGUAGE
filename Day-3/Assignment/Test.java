public class Test {
public static void main(String[] args)
{  // Gusy the ouput
   // int a, b, c;
   // a = b = c = 5;
   // int exp = a + b++ + ++c; 
   // System.out.println("exp = " +exp); 

   // int a, b, exp = 10;
   //a = b = 5;   //  a=5, b=5
   //exp += ++a * b++; // a=6,epx=10, b=5 ouput is 10+(6*5)
   //System.out.println("exp = " +exp); //  Answer is 40;
   /*int a, b, exp = 10;
    a = b = 5;
    exp *= ++a * 10 / b++ + --a;
    System.out.println("exp = " +exp);
    */
   /* Problem 3
    int a = 4;	
   int x = a >= 5 ? 1+2 : 1*1;
  
   if(++x < 4)
	  x += 1;
       System.out.println("Value of x: " +x);
  } */
 /**/
 /*
 */
int a=10, b=10;
boolean c=  true;
 a=c ? ++b:--b;
  System.out.print(b+","+a);
  }
}
