package com.leetcodegfg;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] numbers = {1,1,0,1,1,1};
        System.out.println(findMaximumConsecutiveOnes(numbers));
    }

    public static int findMaximumConsecutiveOnes(int[] numbers){
        int count = 0;
        int max_count = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == 1){
               count++;
            } else{
                count = 0;
            }
            max_count = Math.max(max_count, count);
        }
        return max_count;
    }

}
