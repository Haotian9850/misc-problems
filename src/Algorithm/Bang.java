package Algorithm;

public class Bang {
    /*
    * Compute !x w/o using !
    * */

    public static int bang(int x){
        return (((~x + 1) | x) >> 31) + 1;
    }

    public static void main(String[] args){
        BinaryPrinter bp = new BinaryPrinter();
        bp.prettyPrintBinary(bang(29));
    }
}
