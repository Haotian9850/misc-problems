package Algorithm;

import java.util.*;

public class EightPuzzle {

    /*
    * BFS approach (guarantees shortest search path)
    * */

    public static String toString(int[][] grid){
        StringBuilder sb = new StringBuilder();
        for(int[] row : grid){
            for(Integer i : row){
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static boolean testResult(String s){
        return s.equals("123804765");
    }

    public static List<String> solve(String grid){
        List<String> result = new ArrayList<>();
        Map<String, String> visited = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        String goalState = "123804765";
        queue.offer(grid);
        while(queue.size() > 0){
            String currMove = ((LinkedList<String>) queue).pop();
            List<String> nextVadlidMoves = findNextValidMoves(currMove);
            for(String nextMove : nextVadlidMoves){
                if(!visited.containsKey(nextMove)){
                    visited.put(nextMove, currMove);
                    ((LinkedList<String>) queue).offerLast(nextMove);
                }
                if(testResult(nextMove)){
                    break;
                }
            }
        }
        if(!visited.containsKey(goalState)){
            throw new IndexOutOfBoundsException("Cannot solve!");
        }
        //make result
        while(goalState != null){
            result.add(goalState);
            goalState = visited.get(goalState); //backtrack
        }
        return result;
    }

    //explore all four directions of moving 0
    public static List<String> findNextValidMoves(String currGrid){
        List<String> result = new ArrayList<>();
        int zeroIndex = currGrid.indexOf('0');
        int row = zeroIndex / 3;
        int column = zeroIndex % 3;

        //column
        if(column - 1 >= 0){
            StringBuilder sb = new StringBuilder();
            sb.append(currGrid.substring(0, zeroIndex - 1) +
                    currGrid.substring(zeroIndex) +
                    currGrid.charAt(zeroIndex - 1) +
                    currGrid.substring(zeroIndex + 1, currGrid.length() - 1));
            result.add(sb.toString());
        }
        if(column + 1 < 3){
            StringBuilder sb = new StringBuilder();
            sb.append(currGrid.substring(0, zeroIndex) +
                    currGrid.charAt(zeroIndex + 1) +
                    currGrid.charAt(zeroIndex) +
                    currGrid.substring(zeroIndex + 2, currGrid.length() - 1));
            result.add(sb.toString());
        }
        //row
        if(row - 1 >= 0){
            int temp = (row - 1) * 3 + column;
            StringBuilder sb = new StringBuilder();
            sb.append(currGrid.substring(0, temp) +
                    currGrid.charAt(zeroIndex) +
                    currGrid.substring(temp + 1, zeroIndex) +
                    currGrid.charAt(temp) +
                    currGrid.substring(zeroIndex + 1, currGrid.length() - 1));
            result.add(sb.toString());
        }
        if(row + 1 < 3){
            int temp = (row + 1) * 3 + column;
            StringBuilder sb = new StringBuilder();
            sb.append(currGrid.substring(0, zeroIndex) +
                    currGrid.charAt(temp) +
                    currGrid.substring(zeroIndex + 1, temp) +
                    currGrid.charAt(zeroIndex) +
                    currGrid.substring(temp + 1, currGrid.length() - 1));
        }
        return result;
    }

    public static void main(String[] args){

    }
}
