public class Code_3
{
    public static void subArray(int arr[])
    {
        // int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                System.out.print(arr[k]);
                // count++;
                }
        System.out.println();
        }
        System.out.println();
        }
    }

    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
       subArray( arr);
    }
}