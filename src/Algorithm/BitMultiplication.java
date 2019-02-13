package Algorithm;

public class BitMultiplication {

    public static int multiplyFrac(int x){
        /*
        * return x * y, replicate c behavior (rounds towards 0)
        * */
        /*
        * test caes: y = 5 / 8 = 0.625
        * */
        /*
        * multiply by 5 first, then divide by 8
        * */

        int product = (x << 2) + x; // *5
        int toAdd = (product >> 31) & 7;
        int result = (product + toAdd) >> 3;
        return result;

    }

    public static void main(String[] args){
        System.out.println(multiplyFrac(100));
    }

}
