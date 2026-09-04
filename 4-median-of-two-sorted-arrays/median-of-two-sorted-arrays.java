class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,index=0;
        int n = nums1.length + nums2.length;
        int[] k=new int[n];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                k[index]=nums1[i];
                i++;
            }
            else{
                k[index]=nums2[j];
                j++;
            }
            index++;    
        }
        while(i<nums1.length){
            k[index]=nums1[i];
            i++;
            index++;
        }
        
        while(j<nums2.length){
            k[index]=nums2[j];
            j++;
            index++;
        }
        double r=0;

        if((index)%2==0){
            r=(k[index/2-1]+k[index/2])/2.0;
        }
        else{
            r=k[index/2];
        }
        return r;
    }
}