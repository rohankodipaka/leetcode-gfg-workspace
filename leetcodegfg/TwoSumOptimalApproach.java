package com.leetcodegfg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumOptimalApproach {
    public static void main(String[] args) {
        int[] numbers = {2,6,5,8,11};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] resultIndices= findPairsWithGivenSum(numbers, target);
        for(int index : resultIndices){
            System.out.print(index + " ");
        }
    }

    public static int[] findPairsWithGivenSum(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            int complement = target-numbers[i];
            if(numberMap.containsKey(complement)){
                return new int[]{numberMap.get(complement),i};
            }
            numberMap.put(numbers[i],i);
        }
        return new int[0];
    }

}
