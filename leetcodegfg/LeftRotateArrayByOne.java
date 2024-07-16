package com.leetcodegfg;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] rotatedArray = rotateArrayLeftByOne(numbers);
        for(int values : rotatedArray){
            System.out.print(values + " ");
        }
    }

    public static int[] rotateArrayLeftByOne(int[] numbers){
        int temp = numbers[0];

        for(int i=1; i<numbers.length; i++){
            numbers[i-1] = numbers[i];
        }
        numbers[numbers.length-1] = temp;
        return numbers;
    }

}
