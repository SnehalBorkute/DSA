public class IterativeSearch
{
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addFirst(int data)
    {
          //step1: Create new nnnode
        Node newNode=new Node(data);
        if(head==null)
        {
          head=tail=newNode;
          return;
        }
        //2.newnnode.next=head
        newNode.next= head;
        //step3:
        head=newNode; //point towards newnode
    }
    public static void addLast(int data)
    {
      
        Node newNode=new Node(data);
      if(head==null)
        {
          head=tail=newNode;
          return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static int iterativeSearch(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return 1;
            }
            temp=temp.next;
            i++;
        }
        return -1;

    }
     public static void print()
    {
        if(head==null)
        {
            System.out.println("linklist is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
    }
    public static void main(String args[])
    {
        IterativeSearch l1=new IterativeSearch();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addLast(3);
        l1.addLast(4);
        print();
        System.out.println(l1.iterativeSearch(2));
        System.out.println(l1.iterativeSearch(5));

    }
}