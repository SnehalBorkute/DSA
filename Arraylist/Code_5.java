//MAximum watwe store in container
//Optimal Approach
 import java.util.*;
public class Code_4
{
    public static int storeWAter(ArrayList<Integer>height)
    {
       int maxWater=0;
       int lp=0;
       int rp=height.size()-1;
       while(lp<rp)
       {
        //calculate water area
        int ht=Math.min(height.get(i),height.get(j));
                int width=rp-lp;
                int currWater=h1*width;
                maxWater=Math.max(maxWater,currWater);
                //update ptr
                if(height.get(lp)<height.get(rp))
                {
                    lp++;
                }
                else{
                    rp--;
                }
                return maxWater;
       }
    }
    public static void main(String args[])
    {
        ArrayList<Integer>height=new ArrayList<>();
            height.add(2);
            height.add(8);
            height.add(6);
            height.add(2);
            height.add(5);
            height.add(4);
            height.add(8);
            height.add(3);
            height.add(7);
            System.out.println(storeWAter(height));
        
    }
}