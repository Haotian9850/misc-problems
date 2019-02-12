package Algorithm;

public class BitEqual {


    public static boolean isEqual(int x, int y){
        //compare difference
        if((x ^ y) == 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isEqual(29, 28));
    }
}
