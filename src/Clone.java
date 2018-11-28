import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Clone {
    public static void main(String[] args) throws Throwable {
        int[] testArray = {1, 2, 3};
        System.out.println("testArray mem address: " + testArray);
        System.out.println("testArray default toString" + testArray.toString());
        int[] copyArray = testArray.clone();
        System.out.println("copyArray mem address: " + copyArray);

        for(Integer i : copyArray){
            System.out.print(i);
        }

        //concurrent map compute example
        ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "One");
        concurrentMap.put(2, "Two");

        System.out.println(concurrentMap.compute(1, (key, val) -> val == null ? "One" : "OneButModified!"));

        System.out.println(concurrentMap.get(1));

    }
}
