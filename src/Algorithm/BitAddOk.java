package Algorithm;

public class BitAddOk {

    public static boolean addOK(int x, int y){
        /*
        * check if x + y overflows integer
        * */
        int sum = x + y;
        int signX = x >> 31;
        int signY = y >> 31;
        int signSum = sum >> 31;

        if((~(signX ^ signY) & (signX ^ signSum)) == 1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(addOK(Integer.MAX_VALUE, 2));
    }

}
