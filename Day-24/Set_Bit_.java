public  class Set_Bit_
{  
    public static  int Set_Bit_(int n, int i)
    {
        int bitmask =1<<i;
        return  n|bitmask;
    }
    public static void main(String args[])
    {
        System.out.println(Set_Bit_(10, 2));
    }
}