package com.leetcodegfg;

public class MissingNumberInAnArray {
    public static void main(String[] args) {
        int[]  numbers = {1,2,4,5};
        System.out.println(FindMissingNumber(numbers));
    }

    public static int FindMissingNumber(int[] numbers){
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum = sum+numbers[i];
        }
        int sum2 = 0;
        for(int i=1; i<=numbers.length+1; i++){
            sum2 = sum2+i;
        }
        return (sum2-sum);
    }

}
