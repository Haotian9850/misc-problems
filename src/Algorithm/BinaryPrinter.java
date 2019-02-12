package Algorithm;

public class BinaryPrinter {
    //default constructor
    public BinaryPrinter(){

    }

    public void prettyPrintBinary(int x){
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(x));
        while(sb.length() < 32){
            sb.insert(0, '0');
        }
        System.out.println(sb.toString());
    }

    public String get32BitBinary(int x){
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(x));
        while(sb.length() < 32){
            sb.insert(0, '0');
        }
        return sb.toString();
    }

    public static void main(String[] args){
        BinaryPrinter bp = new BinaryPrinter();
        bp.prettyPrintBinary(29);
    }
}
