public class Code_6
{
    public static int trappedRainWater(int height[])
    {
        //calculate leftmax array
        //calculate rightmax array
        int leftMax[]=new int[height.length];
         leftMax[0]=height[0];
        int n=height.length;
        for(int i=1;i<n;i++)
        {
          leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        int rightMax[]=new int[height.length];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater=0;
        //loop
        for(int i=0;i<n;i++)
        {
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
             trappedWater+= (waterLevel-height[i]);  
        }
        return trappedWater;
    }
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Trapped Rain Water is :"+trappedRainWater(height));
    }
}