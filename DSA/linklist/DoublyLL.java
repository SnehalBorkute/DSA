public class DoublyLL
{
    public class Node
    {
       int data;
        Node prev;
        Node next;
     public Node(int data)
    {
       this.data=data;
       this.next=null;
       this.prev=null;
    }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data)
    {
        Node newnode=new Node(data);
       if(head==null)
       {
        head=tail=newnode;
        size++;
        return;
       }else{
       newnode.next=head;
       head.prev=newnode;
       head=newnode;
       }
        size++;
    }
    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("empty");
            return -1;
        }
        if(size==1)
        {
            int val= head.data;
          tail=head=null;
          return val;
         
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
      DoublyLL ll=new DoublyLL();
      ll.addFirst(3);
      ll.addFirst(2);
      ll.addFirst(1);
      ll.print();
      System.out.println(ll.size);
      ll.removeFirst();
     ll.print();
      System.out.println(ll.size);
    }
}