package algorithm;

import algorithm.visualizerFactory.TwoDimensionalArrayVisualizer;
import algorithm.visualizerFactory.Visualizer;

import java.util.Arrays;

public class NumberOfIslands {

    /*find total number of not-connected islands in grid*/

    static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public static int findIslands(int[][] grid){
        //DFS impl
        int result = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; ++ i){
            for(int j = 0; j < n; ++ j){
                if(grid[i][j] == 1){
                    System.out.println("Ahhh!");
                    DFS(grid, i, j);
                    ++ result;
                }
            }
        }
        return result;
    }

    private static void DFS(int[][] grid, int i, int j){
        int m = grid.length;
        int n = grid[0].length;

        //check boundary conditions
        if(i >= m || i < 0 || j >= n || j < 0 || grid[i][j] == 0){
            return;
        }
        grid[i][j] = 0;
        for(int[] direction : directions){
            int nextI = i + direction[0];
            int nextJ = j + direction[1];
            DFS(grid, nextI, nextJ);
        }
    }

    public static void main(String[] args){

        int[][] testArray = new int[4][4];
        for(int[] row : testArray){
            Arrays.fill(row, 0);
        }
        testArray[1][0] = 1;
        testArray[2][0] = 1;
        testArray[0][3] = 1;
        testArray[1][3] = 1;

        Visualizer v = new TwoDimensionalArrayVisualizer(testArray);
        v.visualize();
        System.out.println(findIslands(testArray));
        Visualizer after = new TwoDimensionalArrayVisualizer(testArray);
        after.visualize();
    }
}
