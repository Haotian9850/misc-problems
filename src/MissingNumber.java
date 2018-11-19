public class MissingNumber {

    /*
    * Find the missing number in a sorted array
    * */

    public static int find(int[] nums){
        //binary search approach, index-based
        int size = nums.length;
        int a = 0, b = size - 1;
        int mid = 0;
        while ((b - a) > 1){  //cannot use b > a
            mid = (a + b) / 2;
            if ((nums[a] - a) != (nums[mid] - mid))
                b = mid;
            else if ((nums[b] - b) != (nums[mid] - mid))
                a = mid;
        }
        return b;
    }

    public static void main(String[] args){
        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(find(testArray));
    }
}
