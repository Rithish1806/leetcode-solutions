class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0,bottom = matrix.length-1;
        int left = 0,right = matrix[0].length - 1;
        List<Integer> arr = new ArrayList<>();
        while(left <= right && top <= bottom){
            for(int i = left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int j = top;j<=bottom;j++){
                arr.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int k = right;k>=left;k--){
                    arr.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if(left<=right){
                for(int l = bottom;l>=top;l--){
                    arr.add(matrix[l][left]);
                }
                left++;
            }
        }
        return arr;
    }
}