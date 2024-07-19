package com.leetcodegfg;

public class KadanesAlgorithmMaxSubArraySum {
    public static void main(String[] args) {
        int[] numbers = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSubArraySum(numbers)); //optimal approach --> O(N)
    }

    public static long findMaxSubArraySum(int[] numbers){
        long maxSum = Long.MIN_VALUE;
        long sum = 0;

        for(int i=0; i< numbers.length; i++){
            sum = sum+numbers[i];

            if(sum>maxSum){
                maxSum = sum;
            }
            // If sum < 0 --> discard the sum calculated
            if(sum<0){
                sum = 0;
            }

        }
        return maxSum;

    }

}
