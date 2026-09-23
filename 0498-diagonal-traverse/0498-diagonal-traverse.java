class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0)return new int[0];
        int r = mat.length;
        int c = mat[0].length;
        int[] result = new int[r*c];
        int x=0,y=0;
        for(int i=0;i<result.length;i++){
            result[i] = mat[x][y];
            if((x+y)%2==0){
                if(y == c-1){
                    x++;
                }
                else if(x==0){
                    y++;
                }
                else{
                    x--;
                    y++;
                }
            }
            else{
                if(x == r-1){
                    y++;
                }
                else if(y==0){
                    x++;
                }
                else{
                    x++;
                    y--;
                }
            }
        }
        return result;
    }
}