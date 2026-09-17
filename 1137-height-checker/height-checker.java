class Solution {
    public int heightChecker(int[] heights) {
        int indices=0;
        int[] arr=new int[heights.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=heights[i];
        }
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights.length-1-i;j++){
                if(heights[j]>heights[j+1]){
                    int t=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=t;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=heights[i]){
            indices++;
           }
        }
        return indices;
    }
}