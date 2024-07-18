package com.leetcodegfg;

import java.util.Scanner;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum : ");
        int[] numbers = {2,3,5,1,9};
        long k = sc.nextLong();
        System.out.println(findLongestSubarrayWithGivenSum(numbers, k));
    }

    public static int findLongestSubarrayWithGivenSum(int[] numbers, long k){
        int length =0;

        for(int i=0; i< numbers.length; i++){
            long sum =0;

            for(int j=i; j<numbers.length; j++){
                sum = sum +numbers[j];

                if(sum==k){
                    length = Math.max(length, j-i+1);
                }

            }
        }
        return length;
    }

}
