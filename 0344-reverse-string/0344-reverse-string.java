class Solution {
    public void reverseString(char[] s) {
        String st = new String(s);
        st = new StringBuilder(st).reverse().toString();

        for(int i = 0;i<st.length();i++)
        {
            s[i] = st.charAt(i);
        }
    }
}