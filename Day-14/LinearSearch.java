public  class LinearSearch
{ public static boolean  LinearSearch(int array[],int key)
{ 
  for(int i=0;i<array.length;i++)
  {
   if(array[i]==key)
   {
     return  true;
   }
  }
  return  false;
}
    public static void main(String[] args) {
        int array[]={2,4,6,8,10,12,14,16};
        int key=110;
         boolean res=LinearSearch(array, key);
        if( res)
        {
            System.out.println("Value is Available in array:"+key);
        }
        else
        {
            System.out.println("Value is Not  Available in array:"+key);  
        }
    }
}