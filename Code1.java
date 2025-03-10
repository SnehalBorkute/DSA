//covert number binary to decimal
public class Code1
{
    public static void binToDecimal(int binNum)
    {
        int pow=0;
       int dec=0;
        while(binNum>0)
        {
        int Ld=binNum%10;
        dec=dec+(Ld* (int)Math.pow(2,pow));
        pow++;
        binNum= binNum/10;
        }
     System.out.println("decimal of"+ binNum + "="+dec);   
        
    }
    public static void main(String args[])
    {
        binToDecimal(101);
    }
}