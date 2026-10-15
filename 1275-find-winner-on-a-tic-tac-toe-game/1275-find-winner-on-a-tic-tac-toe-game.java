class Solution {
    public String tictactoe(int[][] moves) {
        char[][] matrix = new char[3][3];
        char player = 'A';
        int x=0,y=0;
        boolean win = false;
        for(int i=0;i<moves.length;i++){
            x = moves[i][0];
            y = moves[i][1];
            if(player=='A'){
                matrix[x][y] = 'A';
            }
            else if(player == 'B'){
                matrix[x][y] = 'B';
            }
            for(int j=0;j<3;j++){
                if(matrix[j][0] == player &&
                matrix[j][1] == player &&
                matrix[j][2] == player)
                {
                    win  = true;
                }
                if(matrix[0][j] == player &&
                matrix[1][j] == player &&
                matrix[2][j] == player)
                {
                    win  = true;
                }
            }
            if(matrix[0][0]==player &&
            matrix[1][1] == player &&
            matrix[2][2] == player){
                win = true;
            }
            if(matrix[0][2] == player &&
            matrix[1][1] == player &&
            matrix[2][0] == player){
                win = true;
            }
            if(win) break;
            if(player == 'A')player = 'B';
            else player = 'A';
        }
        if(win) return String.valueOf(player);
        if(moves.length == 9) return "Draw";
        return "Pending";
    }
}