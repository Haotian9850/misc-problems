package algorithm;

import java.util.ArrayList;
import java.util.List;

public class RemoveInvalidParen {

    /*
    * backtracking implementation
    * */

    public static List<String> remove(String s){
        List<String> result = new ArrayList<>();
        //get left and right count
        int left = 0;
        int right = 0;
        for(Character c : s.toCharArray()){
            if (c == '('){
                ++ left;
            }else if(c == ')'){
                if(left > 0){
                    -- left;
                }else{
                    ++ right;
                }
            }
        }
        DFS(s, 0, left, right, result);
        return result;
    }

    private static void DFS(String s, int start, int left, int right, List<String> result){
        //result condition
        if(left == 0 && right == 0){
            if(isValid(s)){
                result.add(s);
            }
        }

        for(int i = start; i < s.length(); ++ i){
            if(i != start && s.charAt(i) == s.charAt(i - 1)){
                continue;
            }
            if(left > 0 && s.charAt(i) == '('){
                //remove it!
                DFS(s.substring(0, i) + s.substring(i + 1), i, left - 1, right, result);
            }
            if(right > 0 && s.charAt(i) == ')'){
                DFS(s.substring(0, i) + s.substring(i + 1), i, left, right - 1, result);
            }
        }
    }

    private static boolean isValid(String s){
        int cnt = 0;
        for(int i = 0; i < s.length(); ++ i){
            Character c = s.charAt(i);
            if(c == '('){
                ++ cnt;
            }else if(c == ')' && -- cnt < 0){
                return false;
            }
        }
        return true;
    }

    public static void visualizeStrList(List<String> list){
        for(String s : list){
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        List<String> resultList = remove("()())()");
        visualizeStrList(resultList);
    }

}
