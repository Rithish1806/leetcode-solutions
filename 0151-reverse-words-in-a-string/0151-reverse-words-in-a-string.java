class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            if(i==0)sb.append(str[i]);
            else sb.append(str[i]+" ");
        }
        return sb.toString();
    }
}