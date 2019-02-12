package Java8;

import java.util.Arrays;
import java.util.List;

public class LambaExpressionDemo {


    public static void demo(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(i -> System.out.println("Number: " + i));
    }

    public static void main(String[] args){
        demo();
    }
}
