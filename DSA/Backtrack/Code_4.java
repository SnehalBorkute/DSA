public class Code_4
{
    public static int  gridWays(int i,int j,int n,int m)
    {
        //base
        if(i==n-1&&j==n-1)
        {
            return 1;
        }
        else if(i==n||j==n)
        {
            return 0;
        }
        //kaam
        int w1=gridWays(i,j+1,n,m);
        int w2= gridWays(i+1,j,n,m);
        int w3= w1+w2;
        return w3;
    }
    public static void main(String args[])
    {
        int n=4,  m=4;
        System.out.println(gridWays(0,0,n,m));
    }

}