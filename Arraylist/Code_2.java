//Swap
//sorting ascending ,descending
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class Code_2
{
    public static void swap(ArrayList<Integer>list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(5);
          System.out.println(list);
          System.out.println("After sorting as,ds");
        Collections.sort(list);
         System.out.println(list);
         Collections.sort(list,Collections.reverseOrder());
         System.out.println(list);

         int idx1=1; 
      int idx2=3;
       
         swap(list,idx1,idx2);
         System.out.println("After swap");
         System.out.println(list);
     }
}

