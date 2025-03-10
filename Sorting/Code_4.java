public class Code_4
{
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
    mergeSort(arr,mid+1,ei);
    merge(arr,si,ei,mid);
    }
    public static void merge(int arr[],int si,int ei,int mid)
    {
      
        int temp[]=new int[ei-si+1];
        int i=si;
         int j=mid+1;
         int k=0;
         while(i<=mid && j<=ei)
         {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
         }
         //left part
         while(i<=mid)
         {
            temp[k++]=arr[j++];
         }
         //copy temp to orignal array
        //  int i=si;
         for(k=0;k<temp.length;k++)
         {
            arr[i]=arr[k];
            i++;
         }
    }
    public static void main(String[] args)
    {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}