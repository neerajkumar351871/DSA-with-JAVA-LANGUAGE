public  class Gst
{
    public static void main( String args[])
    {
       float pencil=10.3f ;
       float pen =12.4f ;
       float Eraser=10.3f ;
      float total=pencil+pen+Eraser;
      System.out.println("Without GST price:"+total);
      //  Add 18 percent GST
     float  newprice= total*18/100;
     System.out.print("After applay the gst 18% :"+(total+newprice));
        
    }
}