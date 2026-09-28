class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for(char ch:s.toCharArray()){
            ans = ans > st.size() ? ans : st.size();
            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                st.pop();
            }
        }
        return ans;
    }
}