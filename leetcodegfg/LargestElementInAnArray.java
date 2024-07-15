package com.leetcodegfg;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] numbers = {2,5,1,3,0};
        System.out.println("The Largest element in the array is : "+findLargestElementInArray(numbers));
    }

    public static int findLargestElementInArray(int[] numbers){
        int max = numbers[0];

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
