package Algorithm;

import org.omg.CORBA.INTERNAL;

import javax.naming.InitialContext;

public class ByteSwap {

    /*
    * Swap the mth and nth bit of a given decimal integer
    * */

    public static int byteSwap(int x, int m, int n){
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x >> 20));
        int byte1 = x >> ((m << 3)) & 0xFF;
        int byte2 = x >> ((n << 3)) & 0xFF;
        int temp = byte1 ^ byte2;
        System.out.println("x: " + Integer.toBinaryString(temp));
        temp = temp << (m << 3) | temp << (n << 3);
        System.out.println("final result: " + Integer.toBinaryString(x ^ temp));
        return x ^ temp;
    }

    public static void main(String[] args){
        byteSwap(305419896, 1, 3);
    }
}
