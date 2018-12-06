package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static List<int[]> threeSum(int[] nums, int target){

        List<int[]> result = new ArrayList<>();
        int n = nums.length - 1;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 2; ++ i){
            int left = i + 1;
            int right = n;
            //handle duplicate
            while(i > 0 && nums[i - 1] == nums[i]){
                continue;
            }
            int temp = nums[i] + nums[left] + nums[right];
            if(temp == target){
                result.add(new int[]{nums[i], nums[left], nums[right]});
            }else if(temp < target){
                ++ left;
                while(left > 0 && nums[left] == nums[left - 1]){
                    ++ left;    //handle duplicate
                }
            }else{
                -- right;
                while(right < n - 1 && nums[right - 1] == nums[right]){
                    -- right;
                }
            }
        }

        return result;
    }

}
