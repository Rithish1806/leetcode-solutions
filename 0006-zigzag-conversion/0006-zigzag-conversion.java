class Solution {
    public String convert(String s, int n) {
        if(n==1 || s.length() < n)return s;
        StringBuilder[] rows = new StringBuilder[n];
        for(int i=0;i<n;i++){
            rows[i] = new StringBuilder();
        }
        int in = 0;
        int st = 1;
        for(char c:s.toCharArray()){
            rows[in].append(c);

            if(in == 0){
                st = 1;
            }
            else if(in == n-1){
                st = -1;
            }
            in+=st;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sb : rows){
            result.append(sb);
        }
        return result.toString();
    }
}