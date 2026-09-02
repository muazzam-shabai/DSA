class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;

        long[] ugly = new long[n];
        int[] index = new int[k];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {

            long next = Long.MAX_VALUE;

            // Find the smallest next ugly number
            for (int j = 0; j < k; j++) {
                next = Math.min(next, ugly[index[j]] * primes[j]);
            }

            ugly[i] = next;

            // Move all pointers that produced this number
            for (int j = 0; j < k; j++) {
                if (ugly[index[j]] * primes[j] == next) {
                    index[j]++;
                }
            }
        }

        return (int) ugly[n - 1];
    }
}