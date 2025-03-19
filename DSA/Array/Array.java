import java.util.Scanner;
public class Array
{
    public static void main(String args[])
    {
        int[] arr=new int[5];
          Scanner obj=new Scanner(System.in);
                for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr.length;col++)
            {
                arr[row][col]=obj.newInt();
            }
        }
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr.length;col++)
            {
                System.out.println(arr[row] [col]+" ");
            }
        }
      
        //   for(int i=0;i<arr.length;i++)
        // {
        //    arr[i]= obj.nextInt();
        // }
        // System.out.println(Arr.toString(arr));
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]+" ");
        //  }

        // for(int num:arr)
        // {
        //     System.out.println(num +" ");//here num represent element of array
        // }
    }
}