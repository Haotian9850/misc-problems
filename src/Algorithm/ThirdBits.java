package Algorithm;

public class ThirdBits {

    public static int thridBits(){
        int x = (73 << 9) | 73;
        return (x << 18) | x;
    }

    public static void main(String[] args){
        BinaryPrinter bp = new BinaryPrinter();
        bp.prettyPrintBinary(thridBits());
    }

}
