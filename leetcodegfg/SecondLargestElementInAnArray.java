package com.leetcodegfg;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,7,7,5};
        System.out.println("Second largest is : "+findSecondLargestElement(numbers));
    }

    public static int findSecondLargestElement(int[] numbers){
        if(numbers.length < 2){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] > max){
                secondMax = max;
                max = numbers[i];
            }
            else if(numbers[i] != max && numbers[i] > secondMax){
                secondMax = numbers[i];
            }
        }
        return secondMax;
    }

}
