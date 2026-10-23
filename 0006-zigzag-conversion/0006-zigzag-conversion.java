class Solution {
    public String convert(String s, int n) {
        if(n == 1 || s.length()<n) return s;
        int in = 0;
        int st = 1;
        StringBuilder[] rows = new StringBuilder[n];
        for(int i=0;i<n;i++){
            rows[i] = new StringBuilder();
        }
        for(char ch:s.toCharArray()){
            rows[in].append(ch);
            if(in == 0){
                st = 1;
            }
            else if(in == n-1){
                st = -1;
            }
            in+=st;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            res.append(rows[i]);
        }
        return res.toString();
    }
}