import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoSum {

    public static List<int[]> twoSumDualPointer(int[] nums, int target){
        List<int[]> result = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int temp = nums[left] + nums[right];
            if(temp < target){
                ++ left;
            }else if(temp > target){
                -- right;
            }else{
                result.add(new int[]{nums[left], nums[right]});
            }
        }
        return result;
    }

    public static List<int[]> twoSumHashing(int[] nums, int target){
        List<int[]> result = new ArrayList<>();
        HashSet<Integer> dict = new HashSet<>();
        for(Integer i : nums){
            dict.add(i);
        }
        for(Integer i : nums){
            int diff = target - i;
            if(dict.contains(diff)){
                result.add(new int[]{i, diff});
            }
        }
        return result;
    }

    public static void main(String[] args){
        
    }

}
