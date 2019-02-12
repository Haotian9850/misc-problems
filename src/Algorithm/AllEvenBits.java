package Algorithm;

public class AllEvenBits {

    /*
    * Determine if all even-numbered bits are set to 1
    * */

    public static int allEvenBits(int n){
        //halve the integer
        n &= n >> 16;
        n &= n >> 8;
        n &= n >> 4;
        n &= n >> 2;
        return n & 1;
    }

    public static void main(String[] args){
        BinaryPrinter bp = new BinaryPrinter();
        bp.prettyPrintBinary(29);
        System.out.println(Integer.parseInt("1111", 2));
        System.out.println(allEvenBits(15));
    }
}
