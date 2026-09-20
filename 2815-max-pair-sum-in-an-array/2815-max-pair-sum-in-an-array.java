class Solution {
    public int maxSum(int[] nums) {
        int sum=0,max=0;
        int[] same = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            max = 0;
            int n = nums[i];
            while(n>0){
                max = Math.max(max,n%10);
                n/=10;
            }
            same[i] = max;
        }
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(same[i]==same[j] && nums[i]+nums[j] > sum){
                    sum = nums[i] + nums[j];
                }
            }
        }
        return sum!=0 ? sum : -1;
    }
}