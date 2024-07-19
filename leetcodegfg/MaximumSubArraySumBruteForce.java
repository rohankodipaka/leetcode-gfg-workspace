package com.leetcodegfg;

public class MaximumSubArraySumBruteForce {
    public static void main(String[] args) {
        int[] numbers = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxiunSubArraySum(numbers));
    }
    public static long findMaxiunSubArraySum(int[] numbers){
        long maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            long sum = 0;
            for(int j=i; j<numbers.length; j++){
                sum = sum+numbers[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
