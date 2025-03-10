public class Linear
{
    public static void main(String args[] )
    {
        int[] nums={23,23 -1,65,38,19,-12,7,9};
        int target=19;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target)
    {
        if (arr.length==0);
        {
            return -1;
         }
        for(int index=0;index <arr.length; index++)
        {
           int element = arr[index];
           if(element==target)
           {
            return index;
           }
        }
        return -1;
    }
}