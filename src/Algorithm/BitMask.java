package Algorithm;

public class BitMask {

    /*
    * Generate a mask consisting of all 1 between low bit and high bit (must be inclusive)
    * */

    public static int bitMask(int highBit, int lowBit){
        int i = ~ 0;
        int temp = (i << highBit << 1) & (i << lowBit);
        return ~temp;
    }

    public static void main(String[] args){
        BinaryPrinter bp = new BinaryPrinter();
        bp.prettyPrintBinary(bitMask(12, 2));
    }
}
