public class code_3
{
    public static void insertionSort(int arr[])
    {
        int curr; int prev;
        int i;
        int n=arr.length;
        for( i=0;i<n;i++)
        {
         curr=arr[i];
        prev=i-1;
        while(prev>=0 && curr<arr[prev])
        {
            arr[prev+1]=arr[prev];
            prev--;
        }
        
        arr[prev+1]=curr;
        }
    }
     public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 1, 6};
        insertionSort(arr);
        PrintArr(arr);
    }
}
