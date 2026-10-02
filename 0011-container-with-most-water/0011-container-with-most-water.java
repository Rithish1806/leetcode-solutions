class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int max=0;
        int l=0,r=n-1;
        while(l<=r){
            int length = Math.min(h[l],h[r]);
            int b = r - l;
            int area = length * b;
            if(area>max)
            {
                max=area;
            }
            if(h[l]<=h[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}