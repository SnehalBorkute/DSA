import java.util.*;
public class Code_7
{
    public static int buySellStocks(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            if(buyPrice<prices[i])
            {
              int Profit=prices[i]-buyPrice;
              maxProfit=Math.max(Profit,maxProfit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String args[])
    {
        int prices[]={7,1,5,3,6,4};
       System.out.println("maxprofit :"+ buySellStocks(prices));
    }

}