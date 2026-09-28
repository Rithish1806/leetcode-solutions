class Solution {
    public int maxProduct(String[] words) {
        int[] mask = new int[words.length];
        for(int i=0;i<words.length;i++){
            for(char c:words[i].toCharArray()){
                mask[i] |= (1 << (c - 'a'));
            }
        }
        int ans =0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if((mask[i] & mask[j])==0){
                    int pro = words[i].length() * words[j].length();
                    if(pro>ans){
                        ans = pro;
                    }
                }
            }
        }
        return ans;
    }
}