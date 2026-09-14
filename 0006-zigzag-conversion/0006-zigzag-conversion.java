class Solution {
    public String convert(String s, int n) {
        if(n == 1 || s.length() <n){
            return s;
        }
        int r = n;
        int c = s.length();
        char[][] rows = new char[r][c];
        int st = 1;
        r = 0;
        c = 0;
        int in =0;
        for(char ch : s.toCharArray()){
            rows[r][c] = ch;

            if(r == 0){
                st = 1;
            }
            else if(r == n-1){
                st = -1;
            }
            if(st == 1){
                r++;
            }
            else if(st == -1){
                r--;
                c++;
            }
            in++;
        }
        char[] ans = new char[s.length()];
        int k=0;
        for(int i =0;i<n;i++){
            for(int j=0;j<s.length();j++){
                if(rows[i][j] != '\0'){
                    ans[k++] = rows[i][j];
                }
            }
        }

        return new String(ans);
    }
}