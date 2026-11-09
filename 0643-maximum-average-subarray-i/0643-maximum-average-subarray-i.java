class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = -Double.MAX_VALUE;
        if(nums.length == 1 || nums.length == 0)return nums[0];
        for(int i=0;i<nums.length-k+1;i++){
            int sum = 0;
            double avg = 0;
            for(int j=i;j<k+i;j++){
                sum+=nums[j];
            }
            avg = (double)sum / (double)k;
            max = (double)Math.max(avg,max);
        }
        return max;
    }
}