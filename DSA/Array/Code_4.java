public class Code_4
{
    public static void subArray(int arr[])
    {   
         int mS=Integer.MIN_VALUE;
         int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
              int sum=0;
                for(int k=i;k<=j;k++)
                {
                  sum+=arr[k];
                // System.out.print(arr[k]);
                // count++;
                }
                if(sum>mS)
                {
                  mS=sum;
                }
        System.out.println();
        }
        }
        System.out.println("maxsum="+mS);
        
    }

    public static void main(String args[])
    {
        int arr[]={2,6,8,10};
       subArray( arr);
    }
    }

