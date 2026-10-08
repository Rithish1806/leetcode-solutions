class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(c);
            }
            if(st.size()>1){
                sb.append(c);
                if(c==')'){
                    st.pop();
                }
            }
            else if(c==')'){
                st.pop();
            }
        }
        return sb.toString();
    }
}