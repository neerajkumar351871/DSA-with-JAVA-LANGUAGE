public class Bruteforce {

    public static void BruteforceAlgo(int array[]) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
      
    for(int i=0;i<array.length;i++)
    {     int sum=0;
        for(int j=0;j<i+1;j++)
        {
            System.out.print(array[j]+" ");
            sum+=array[j];
            System.out.print(sum);
           // max=Math.max(max,sum);
           if(max<sum)
           {
            max=sum;
           }
            min=Math.min(sum,min);
          
          
        }
         System.out.println(" ");
         
    }
    System.out.println("Max value:"+max);
    System.out.println("Min Value :"+min);

    }

    public static void main(String[] args) {
   int array[]={1,-2,6,-1,3};
     BruteforceAlgo(array);
    }
}
