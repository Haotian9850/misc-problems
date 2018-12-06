package algorithm;

public class LucasSequence {

    /*
    * Finds nth number of Lucas Sequence of degree
    * */
    public static void lucasSequence(int n, int P, int Q){
        //dynamic programming approach
        int[] dp = new int[n + 1];
        //init
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; ++ i){
            dp[i] = P * dp[i - 1] - Q * dp[i - 2];
            System.out.print(dp[i] + " ");
        }
        System.out.println(dp[dp.length - 1]);
    }

    public static void main(String[] args){
        lucasSequence(6, 3, -1);
    }
}
