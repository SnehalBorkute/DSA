public class Code_2
{
    public static void PairsInArray(int arr[])
    {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int curr=arr[i];
            for(int j=i+1;j<n;j++)
            {
                System.out.print("(" +curr+","+arr[j] +")");
                count++;
            }
        
        System.out.println();
        }
        System.out.print(count);
    }

    public static void main(String args[])
    {
        int arr[]={2,4,6,8};
        PairsInArray( arr);
    }
}