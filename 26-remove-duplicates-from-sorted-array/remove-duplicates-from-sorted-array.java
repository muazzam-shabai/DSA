class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        k++;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else{
                nums[k]=nums[i];
                k++;
            }
        }

        return k;
    }
}