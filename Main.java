import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
     Scanner obj =new Scanner (System.in);
   int rollno=obj.nextInt();
   System.out.println("your rollno is"+ rollno);
    int num1= obj.nextInt();
    int num2= obj.nextInt();
    int sum=num1+num2;
    System.out.println("sum="+sum);
 
    }
}