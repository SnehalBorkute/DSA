//MAximum watwe store in container
 import java.util.*;
public class Code_4
{
    public static int storeWAter(ArrayList<Integer>height)
    {
        int maxWater=0;
        for(int i=0;i<height.size();i++)
        {
            for(int j=1;j<height.size();j++)
            {
                int h1=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currWater=h1*width;
                maxWater=Math.max(maxWater,currWater);
            }
        }
        return maxWater;
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