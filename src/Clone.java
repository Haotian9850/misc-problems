public class Clone {
    public static void main(String[] args){
        int[] testArray = {1, 2, 3};
        System.out.println("testArray mem address: " + testArray);
        System.out.println("testArray default toString" + testArray.toString());
        int[] copyArray = testArray.clone();
        System.out.println("copyArray mem address: " + copyArray);
        for(Integer i : copyArray){
            System.out.print(i);
        }

    }
}