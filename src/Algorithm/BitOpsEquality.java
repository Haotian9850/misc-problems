package Algorithm;

public class BitOpsEquality {


    public static void main(String[] args){
        int x = 8;
        int y = 29;
        int a = 2;

        System.out.print("(x ^ y) and (x | y): ");
        System.out.println((x ^ y) <= (x | y));

        System.out.print("((x >> a) | (y >> a)) and ((x | y) >> a): ");
        System.out.println(((x >> 7) | (y >> 7)) == ((x | y) >> 7));

        System.out.print("(x & y & a) <= (x | y | a): ");
        System.out.println((x & y & a) <= (x | y | a));

        System.out.print("((x >> 3) & 0x7) and ((x & 0x3F) >> 3): ");
        System.out.println(((x >> 3) & 0x7) == ((x & 0x3F) >> 3));


    }
}
