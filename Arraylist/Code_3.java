import java.util.*;
public class Code_3
{
    public static void main(String args[])
    {
        // ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        // ArrayList<Integer>list1=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // mainList.add(list1);
                
        // ArrayList<Integer>list2=new ArrayList<>();
        // list2.add(5);
        // list2.add(6);
        // mainList.add(list2);
        // for(int i=0;i<mainList.size();i++)
        // {
        //     ArrayList<Integer>curr=mainList.get(i);
        //     for(int j=0;j<curr.size();j++)
        //     {
        //         System.out.print(curr.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        //  System.out.println(mainList);
          
        //   print l1=1 2 3 4 
        //   l2=2 4 6 8 
        //   l3=3,6,9,12
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();         
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        for(int i=1;i<5;i++)
        {
           list1.add(i*1);//1 2 3 4
           list2.add(i*2);//2 4 6 8
           list3.add(i*3);//3 6 9 12
        }
       list.add(list1);
       list.add(list2);
       list.add(list3);
       System.out.println(list);
       for(int i=0;i<list.size();i++)
       {
        ArrayList<Integer>curr=list.get(i);
        for(int j=0;j<curr.size();j++)
        {
            System.out.print(curr.get(j)+" ");
        }
        System.out.println();
       }

    }
}