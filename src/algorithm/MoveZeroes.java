package algorithm;

public class MoveZeroes {

    public static void move(int[] nums){
        //in-place impl
        int lastNonZeroIndex = 0;
        for(int i = 0; i < nums.length; ++ i){
            if(nums[i] != 0){
                nums[lastNonZeroIndex] = nums[i];
                ++ lastNonZeroIndex;
            }
        }
        for(int i = lastNonZeroIndex; i < nums.length; ++ i){
            nums[i] = 0;
        }
    }

    public static void visualizeIntArray(int[] nums){
        for(Integer i : nums){
            System.out.print(" " + i);
        }
    }

    public static void main(String[] args){
        int[] testArray = {1, 2, 3, 0, 3, 0, 4, 7, 0, 8, 0, 0, 0};
        move(testArray);
        visualizeIntArray(testArray);
    }
}
