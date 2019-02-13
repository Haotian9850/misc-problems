package Algorithm;

import org.omg.CORBA.INTERNAL;

public class BitParity {

    /*
    * Return 1 if x has an odd number of 0s
    * */

    public static int bitParity(int x){
        //prep 0x0000FFFF: NO NEED!
        System.out.println("input in binary: " + Integer.toBinaryString(x));
        x ^= (x >> 16);
        System.out.println("x >> 16: " + Integer.toBinaryString(x));
        x ^= (x >> 8);
        System.out.println(("x >> 8: " + Integer.toBinaryString(x)));
        x ^= (x >> 4);
        System.out.println("x >> 4: " + Integer.toBinaryString(x));
        x ^= (x >> 2);
        System.out.println("x >> 2: " + Integer.toBinaryString(x));
        x ^= (x >> 1);
        System.out.println("x >> 1: " + Integer.toBinaryString(x));
        return x & 1;
    }

    public static void main(String[] args){
        bitParity(65535);

        System.out.println("--------------------------------------------");

        bitParity(131071);
    }

}
