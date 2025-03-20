public class RecursiveSearch
{
    public static class Node
    {
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
    public static int helper(Node head,int key)
    {
      if(head==null)
      {
        return -1;
      }
      if(head.data==key)
      {
        return 0;
      }
      int idx= helper(head.next,key);
      if(idx==-1)
      {
        return -1;
      }
      return idx+1;
    }
    public static int recSearch(int key)
    {
        return helper(head,key);
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
     public static void main(String Args[])
    {
    RecursiveSearch l1= new RecursiveSearch();
     l1.print();
      l1.addFirst(2);
       print();
      l1.addFirst(1);
      l1.addLast(3);
       print();
      l1.addLast(4);
      print();
      System.out.println(l1.recSearch(2));
    }
    }
    
