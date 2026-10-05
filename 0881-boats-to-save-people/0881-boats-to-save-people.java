class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int left = 0;
        int right = p.length-1;
        int boat = 0;
        while(left<=right){
            int tot = p[left] + p[right];
            if(tot <= limit){
                boat++;
                left++;
                right--;
            }
            else{
                boat++;
                right--;
            }
        }
        return boat;
    }
}