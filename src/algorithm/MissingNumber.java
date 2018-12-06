package algorithm;

public class MissingNumber {

    /*
    * Find the missing number in a sorted array
    * */

    public static int find(int[] nums){
        //binary search approach, index-based
       int size = nums.length;
       int left = 0;
       int right = size - 1;
       while(right > left + 1){ //note: cannot simply used right > left!
           int mid = left + (right - left) / 2;
           if(nums[left] - left != nums[mid] - mid){
               right = mid;
           }else if(nums[right] - right != nums[mid] - mid){
               left = mid;
           }
       }
       return right;
    }

    public static void main(String[] args){
        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(find(testArray));
    }
}
