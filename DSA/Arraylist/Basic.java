import java.util.ArrayList;
public class Basic
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
        list.add(4);
        list.add(5);
        System.out.println(list);
        //get operation
      int element=  list.get(2);
      System.out.println(element);
      list.remove(2);
      System.out.println(list);
      list.set(3,10);
      System.out.println(list);
      System.out.println(list.contains(1));
      System.out.println(list.contains(11));
      System.out.println(list.size());
      for(int i=0;i<list.size();i++)
      {
        System.out.print(list.get(i)+" ");
      }

    }
}