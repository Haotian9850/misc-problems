import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    /*
    * Simple word break, returns a boolean
    * */
    public static boolean canBreak(HashSet<String> dict, String sentence){
        //DP approach
        boolean[] dp = new boolean[sentence.length() + 1];
        //init
        Arrays.fill(dp, false);
        dp[0] = true;
        for(int i = 1; i <= sentence.length(); ++ i){
            for(int j = 0; j < i; ++ j){
                if(dict.contains(sentence.substring(j, i)) && dp[j]){
                    dp[i] = true;
                    break;  //剪枝
                }
            }
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args){
        String testStr = "applepenapple";
        Set<String> dict = new HashSet<>();
        dict.add("apple");
        dict.add("pen");
        System.out.println(canBreak((HashSet<String>) dict, testStr));
    }
}
