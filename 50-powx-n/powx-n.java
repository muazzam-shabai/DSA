class Solution {
    public double myPow(double x, int n) {
        double val;
        long power=n;
        if(n>0){
            val=Math.pow(x,power);
        }
        else{
            val=1/Math.pow(x,-power);
        }
        return val;
    }
}