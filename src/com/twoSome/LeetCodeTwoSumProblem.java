package com.twoSome;

import java.util.Arrays;

public class LeetCodeTwoSumProblem {
    public int[] twoSum(int[] nums, int target){
       for (int i  = 0; i<nums.length; i++ ){
           for (int j =i+1; j<nums.length; j++){
               int complement = target - nums[i];
               if(nums[j]== complement){
                   return new int[]{i,j};
               }
           }
       }
       throw new IllegalArgumentException("no match found");
    }
    public static void main(String[] args){
        LeetCodeTwoSumProblem leetCodeTwoSumProblem = new LeetCodeTwoSumProblem();
        int[] a = {2,5,11,15};
        int target=9;
      int[] b =  leetCodeTwoSumProblem.twoSum(a,target);
        System.out.println(Arrays.toString(b));

    }
}
