class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length];
        int[] freq = new int[1001];

        for (int num : arr1) {
            freq[num]++;
        }

        int k = 0;

        for (int num : arr2) {

            while (freq[num] > 0) {
                arr[k] = num;
                k++;
                freq[num]--;
            }
        }

        for (int i = 0; i < freq.length; i++) {

            while (freq[i] > 0) {
                arr[k] = i;
                k++;
                freq[i]--;
            }
        }

        return arr;
    }
}