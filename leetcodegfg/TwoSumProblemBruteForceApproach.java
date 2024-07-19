package com.leetcodegfg;

import java.util.Scanner;

public class TwoSumProblemBruteForceApproach {
    public static void main(String[] args) {
        int[] numbers = {2,6,5,8,11};
        Scanner sc = new Scanner(System.in);
        long targetSum = sc.nextLong();
        System.out.println(checkPairWithGivenSum(numbers, targetSum));
        int[] resultIndices = returnPairWithGivenSum(numbers, targetSum);
        for(int index : resultIndices){
            System.out.print(index + " ");
        }
    }


    //1st variant
    public static String checkPairWithGivenSum(int[] numbers, long targetSum){
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1; j< numbers.length; j++){
                if((numbers[i]+numbers[j])==targetSum){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    //2nd variant
    public static int[] returnPairWithGivenSum(int[] numbers, long targetSum){
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1; j< numbers.length; j++){
                if((numbers[i]+numbers[j])==targetSum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0]; //return an empty array if no pair found
    }

}
