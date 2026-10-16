class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start<end){
            char ch1 = Character.toLowerCase(arr[start]);
            char ch2 = Character.toLowerCase(arr[end]);
            if(isVowel(ch1) && isVowel(ch2)){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(!isVowel(ch1)){
                start++;
            }
            else{
                end--;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char ch1){
        return (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u');
    }
}