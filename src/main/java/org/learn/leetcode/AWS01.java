package org.learn.leetcode;

// https://leetcode-cn.com/problems/two-sum/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AWS01 {
    public static void main(String[] args){
        AWS01 test = new AWS01();
        int[] nums = {2,7,11,15};
        int target = 9;

        test.test(nums, target);

        test.test(new int[]{3,2,4}, 6);
        test.test(new int[]{3,3}, 6);
    }
    public void test(int[] nums, int target){

        for(int i: nums){
            System.out.print(i + ", ");
        }
        System.out.println("\n" + target);

        int[] result = twoSum(nums, target);
        for(int i : result){
            System.out.print(i + ", ");
        }
        System.out.println("\n-----------------");
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        Map map = new HashMap<Integer, Integer>();
        for(int i=0, len=nums.length; i<len; i++){
            map.put(nums[i], i);
        }

        for(int i=0, len=nums.length; i<len; i++){
            int b = target - nums[i];
            if(map.containsKey(b) && i!= (int)map.get(b)){
                return new int[]{i, (int) map.get(b)};
            }
        }

        return new int[]{};

    }
}
