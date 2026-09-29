class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String curr = new StringBuilder(arr[i]).reverse().toString();
            if(i!=arr.length-1){
                sb.append(curr).append(" ");
            }
            else{
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}