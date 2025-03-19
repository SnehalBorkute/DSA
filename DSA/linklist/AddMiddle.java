public class AddMiddle
{
    public static class Node
    {
        int data ;
        Node next;
        public Node(int data)
        {
         this.data = data;
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
    public void AddMiddle(int idx,int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        //i=idx-1 temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String Args[])
    {
     AddMiddle l1= new AddMiddle();
     l1.print();
      l1.addFirst(1);
       print();
      l1.addFirst(2);
      l1.addLast(3);
       print();
      l1.addLast(4);
      print();
      l1.AddMiddle(2,9);
      print();
    }
}