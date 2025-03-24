import java.util.LinkedList;
public class JavaCollectionFramework
{
    public static void main(String args[])
    {
      LinkedList<Integer>ll=new LinkedList<>();//create
      //add
      ll.addLast(1);
      ll.addLast(2);
      ll.addFirst(0);
      System.out.println(ll);
    //premove
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
}
}