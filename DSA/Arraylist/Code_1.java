//print reverse
//maximum no.
import java.util.ArrayList;
public class Code_1
{
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        //Add opr
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(5);

        //reverse print
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Maximum in array
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            // if(max<list.get(i))
            // {
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        }
        System.out.println("max value ="+max);

    }}