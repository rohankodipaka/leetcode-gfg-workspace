package com.leetcodegfg;


public class NumberThatAppearOnce {
    public static void main(String[] args) {
        int[] numbers = {4,1,2,1,2};
        System.out.println(findNumberThatAppearOnce(numbers));
    }

    public static int findNumberThatAppearOnce(int[] numbers){
        int result = 0;
        for(int i=0; i<numbers.length; i++){
            result = result^numbers[i];
        }
        return result;
    }



}
