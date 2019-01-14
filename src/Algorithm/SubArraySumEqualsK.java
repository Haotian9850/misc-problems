package Algorithm;

import java.util.HashMap;

public class SubArraySumEqualsK {

    /*find number of subarrays summing up to k*/

    public static int findSubArrays(int[] nums, int k){
        //map approach
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();    //key: prefix sum; value: number of subarrays with sum temp
        map.put(0, 1);
        int temp = 0;
        for(int i = 0; i < nums.length; ++ i){
            temp += nums[i];
            if(map.containsKey(temp - k)){
                result += map.get(temp - k);
            }
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);   //overrides!
            }else{
                map.put(temp, 1);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] testArray = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(findSubArrays(testArray, 1));
    }
}
