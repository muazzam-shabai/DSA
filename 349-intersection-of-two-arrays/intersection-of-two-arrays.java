class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr=new int[Math.min(nums1.length,nums2.length)];
        int k=0;
        boolean present=false;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    present = false;
                    for(int l=0;l<k;l++){
                        if(nums1[i]==arr[l]){
                            present=true;
                            break;
                        }
                    }
                    if(!present){
                        arr[k]=nums1[i];
                        k++;
                    }
                    break;
                }
            }
        }
        return Arrays.copyOf(arr,k);
    }
}