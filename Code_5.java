public class Code_5


{
    public static void kadanesMax(int arr[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
       for (int i=0;i<arr.length;i++)
       {
         cs+=arr[i];
         if(cs<0)
         {
            cs=0;
         }
           ms=Math.max(ms,cs);
       }
       System.out.println("maxsum :"+ms);
    }

    public static void main(String args[])
    {
        int arr[]={2,4,6,8};
       kadanesMax( arr);
    }
}