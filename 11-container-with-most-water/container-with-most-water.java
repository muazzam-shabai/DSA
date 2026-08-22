class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0,right=n-1;
        int water=0;
        int maxWater=Integer.MIN_VALUE;
        while(left<right){
            water=Math.min(height[left],height[right])*(right-left);
            maxWater=Math.max(maxWater,water);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxWater;
    }
}