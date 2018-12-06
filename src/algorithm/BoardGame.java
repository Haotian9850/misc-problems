package algorithm;

import java.util.Random;

public class BoardGame {

    //initialize the board
    public static int[][] init(int m, int n, int max){
        Random rd = new Random();
        int[][] result = new int[m][n];
        for(int i = 0; i < m; ++ i){
            for(int j = 0; j < n; ++ j){
                result[i][j] = rd.nextInt(max) + 1;
            }
        }
        return result;
    }

    public static void nextState(int[][] board, int target){
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int original = board[0][0];
        //check
        if(original == target){
            return;
        }
        DFS(board, original, target, 0, 0, directions); //modify board in-place
    }

    private static void DFS(int[][] board, int original, int target, int i, int j, int[][] directions){
        int m = board.length;
        int n = board[0].length;

        for(int[] direction : directions){
            int nextI = i + direction[0];
            int nextJ = j + direction[1];
            //check index
            if(nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n){
                //check value
                if(board[nextI][nextJ] == original){
                    board[nextI][nextJ] = target;
                    DFS(board, original, target, nextI, nextJ, directions);
                }else{
                    return;
                }
            }else{
                return;
            }
        }
    }
}
